package cursokotlin

import java.text.DecimalFormat

fun main(){
    val resultado = 10.0 / 3.0
    val formato: DecimalFormat = DecimalFormat("#.##")

    println(resultado) // Sin redondeo
    println(Math.round(resultado)) // Con redondeo
    println(formato.format(resultado))
}