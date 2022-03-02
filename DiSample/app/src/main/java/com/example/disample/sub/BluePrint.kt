package com.example.disample.sub

class BluePrint(material: Material, tool: Tool) {

    var material: Material = Material()
    var tool: Tool = Tool()

    init {
        this.material = material
        this.tool = tool
    }

    fun getBluePrint(): String {
        return "material : $material , tool : $tool"
    }
}