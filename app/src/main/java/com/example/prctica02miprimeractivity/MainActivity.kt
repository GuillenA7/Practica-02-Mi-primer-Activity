package com.example.prctica02miprimeractivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var herramientaMecanica: HerramientaMecanica

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos de la interfaz
        val editMarca = findViewById<EditText>(R.id.editMarca)
        val editModelo = findViewById<EditText>(R.id.editModelo)
        val editCodigo = findViewById<EditText>(R.id.editCodigo)
        val editCosto = findViewById<EditText>(R.id.editCosto)
        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editTamano = findViewById<EditText>(R.id.editTamano)
        val editDimensiones = findViewById<EditText>(R.id.editDimensiones)
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        // Botón para agregar información a la herramienta
        btnAgregar.setOnClickListener {
            val marca = editMarca.text.toString()
            val modelo = editModelo.text.toString()
            val codigo = editCodigo.text.toString()
            val costo = editCosto.text.toString().toDoubleOrNull() ?: 0.0
            val peso = editPeso.text.toString().toDoubleOrNull() ?: 0.0
            val tamaño = editTamano.text.toString()
            val dimensiones = editDimensiones.text.toString()

            herramientaMecanica = HerramientaMecanica(marca, modelo, codigo, costo, peso, tamaño, dimensiones)
        }

        // Botón para mostrar la información de la herramienta
        btnMostrar.setOnClickListener {
            if (::herramientaMecanica.isInitialized) {
                textResultado.text = herramientaMecanica.mostrarInformacion()
            } else {
                textResultado.text = "No hay información para mostrar."
            }
        }

        // Botón para limpiar las cajas de texto
        btnLimpiar.setOnClickListener {
            editMarca.text.clear()
            editModelo.text.clear()
            editCodigo.text.clear()
            editCosto.text.clear()
            editPeso.text.clear()
            editTamano.text.clear()
            editDimensiones.text.clear()
        }
    }
}