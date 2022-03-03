package com.example.disample.dagger

import com.example.disample.sub.BluePrint
import com.example.disample.sub.Material
import com.example.disample.sub.Tool
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class BluePrintModule @Inject constructor() {

    @Provides
    fun provideBluePrint(material: Material, tool: Tool): BluePrint {
        return BluePrint(material, tool)
    }

    @Provides
    fun provideMaterial(): Material {
        return Material()
    }

    @Provides
    fun provideTool(): Tool {
        return Tool()
    }
}