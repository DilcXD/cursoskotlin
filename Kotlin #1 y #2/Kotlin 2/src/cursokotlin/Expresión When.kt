package cursokotlin

val age2 = 60
val name = "David"

fun main(){

    when{
        age2 < 18 -> {
            println("Entro a la primera condición")
            println("Menor de edad")
        }
        age2  < 60 -> println("Mayor de edad")
        else -> println("Tercera edad")
    }

    when (age2){
        in 1..17 -> println("Menor de edad")
        in 18..59 -> println("Mayor de edad")
        in 60..120 -> println("Tercera edad")
        else -> println("Incorrecto")
    }

    when (nombre){
        "David", "José" -> println("Hombre")
        "María" -> println("Mujer")
        else -> println("No está en la lista")
    }

    var variable: Any = 10.0

    when (variable){
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
    }

    variable = 10

    when (variable){
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
    }

    variable = "Hola"

    when (variable){
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
    }
}