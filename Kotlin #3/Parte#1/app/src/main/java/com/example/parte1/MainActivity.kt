package com.example.parte1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // ---------------- INFORMACIÓN PERSONAL
            val fechaNacimiento = "15/12/2002"
            println("Fecha de nacimiento: $fechaNacimiento")

            // Diferencia entre var y val
            var nombreUsuario = "Desconocido"
            println("Nombre antes: $nombreUsuario")

            nombreUsuario = "Alexis Álvarez"
            println("Nombre después: $nombreUsuario")

            // ---------------- TIPOS DE VARIABLES
            val clienteVip: Boolean = true
            val edad: Int = 23
            val saldo: Float = 120.75F
            val salario: Double = 550.99
            val inicial: Char = 'A'

            println("Cliente VIP: $clienteVip")
            println("Edad actual: $edad")
            println("Saldo disponible: $saldo")
            println("Salario mensual: $salario")
            println("Inicial del nombre: $inicial")

            // ---------------- CONCATENACIÓN
            val mensaje = "Bienvenido $nombreUsuario, tu saldo es $saldo"
            println(mensaje)

            // ---------------- OPERACIONES
            var x: Int = 15
            var y: Int = 4

            println("Operaciones aritméticas con $x y $y:")
            println("Suma = ${x + y}")
            println("Resta = ${x - y}")
            println("Multiplicación = ${x * y}")
            println("División entera = ${x / y}")
            println("Módulo = ${x % y}")

            // ---------------- INCREMENTOS Y DECREMENTOS
            var incremento = 7
            println("Pre-incremento: ${++incremento}")
            println("Valor final: $incremento")

            var decremento = 7
            println("Pre-decremento: ${--decremento}")
            println("Valor final: $decremento")

            var incPost = 7
            println("Post-incremento: ${incPost++}")
            println("Valor final: $incPost")

            var decPost = 7
            println("Post-decremento: ${decPost--}")
            println("Valor final: $decPost")

            // ---------------- OPERADORES COMPUESTOS
            var cuenta: Float = 500.0F
            val deposito: Float = 100.0F

            println("Saldo inicial: $cuenta")
            cuenta += deposito
            println("Saldo tras depósito: $cuenta")
            cuenta -= 50F
            println("Saldo después de retirar 50: $cuenta")
            cuenta *= 2
            println("Saldo duplicado: $cuenta")
            cuenta /= 4
            println("Saldo dividido entre 4: $cuenta")
            cuenta %= 9
            println("Saldo con módulo 9: $cuenta")

            insets
        }
    }
}

// Constante general
const val UNIVERSIDAD = "Universidad Nacional Politécnica"

// Variable global
val autor: String = "Archivo hecho por Alexis Álvarez"
