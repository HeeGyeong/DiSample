package com.example.disample.datastore

import android.content.Context
import java.io.IOException
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.booleanPreferencesKey

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map


class DataStore(private val context: Context) {

    private val Context.dataStore by preferencesDataStore(name = "dataStore")
    private val stringKey = booleanPreferencesKey("permissionCheck")

    val dataStorePermission: Flow<Boolean> = context.dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { preferences ->
            preferences[stringKey] ?: false
        }

    suspend fun setDataStorePermission(isCheck: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[stringKey] = isCheck
        }
    }
}