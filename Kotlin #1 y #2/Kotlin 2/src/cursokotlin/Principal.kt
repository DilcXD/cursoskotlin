package cursokotlin

var edad: Int = 30
val edad1: Int = 50 // A diferencia de var, val no puede ser modificado
val numero: Double = 1_000_000.0
val letra: Char = 'a'
val letras = "Hola"
val estado = true

fun main(){
    println(edad)
    edad = 45
    println(edad)
    //edad1 = 60
    println(edad1)
    println(numero)
    println(letra)
    println(letras)
    println(estado)
}