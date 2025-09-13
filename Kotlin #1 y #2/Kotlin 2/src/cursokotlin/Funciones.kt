package cursokotlin

import java.math.BigDecimal
import java.util.*


fun main(){
    mostrarFecha()

    val impuesto = calcularImpuesto(BigDecimal("1000"))
    println("El impuesto $1000.00 es de \$$impuesto")
}

fun calcularImpuesto(valor: BigDecimal, impuesto: BigDecimal = BigDecimal("16")) : BigDecimal{

    var resultado = valor.divide(BigDecimal("100"))
    resultado = resultado.multiply(impuesto)

    return resultado.setScale(2, BigDecimal.ROUND_HALF_UP)
}

fun mostrarFecha(){
    println("--------------------------------")
    println(Date())
    println("--------------------------------")
}