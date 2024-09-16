package com.example.prctica02miprimeractivity

open class Herramienta(
    var marca: String = "",
    var modelo: String = "",
    var codigo: String = "",
    var costo: Double = 0.0
)

class HerramientaMecanica(
    marca: String = "",
    modelo: String = "",
    codigo: String = "",
    costo: Double = 0.0,
    var peso: Double = 0.0,
    var tamaño: String = "",
    var dimensiones: String = ""
) : Herramienta(marca, modelo, codigo, costo) {

    fun mostrarInformacion(): String {
        return "Marca: $marca\nModelo: $modelo\nCódigo: $codigo\nCosto: $costo\n" +
                "Peso: $peso\nTamaño: $tamaño\nDimensiones: $dimensiones"
    }
}