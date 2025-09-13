package cursokotlin

var sesionIniciar = true
var age1 = 70
val credencialDescuento = false

fun main(){
    if(sesionIniciar == true){
        println("Bienvenido")
    } else{
        println("Inicia Sesión")
    }
    sesionIniciar = false

    if(sesionIniciar != true){
        println("Inicia Sesión")
    } else{
        println("Bienvenido")
    }

    if(age1 <= 18){
        println("Menor de edad")
    } else {
        println("Mayor de edad")
    }

    if (age1 < 18){
        println("Menor de edad")
    } else if (age1 < 60){
        println("Mayor de edad")
    } else{
        println("Tercera edad")
    }

    if(age1 >= 60 && credencialDescuento == true){
        println("Descuento")
    } else {
        println("No aplica")
    }

    if(age1 >= 60 || credencialDescuento == true){
        println("Descuento")
    } else {
        println("No aplica")
    }

    sesionIniciar = false

    if(!sesionIniciar){
        println("Bienvenido")
    } else {
        println("Inicia Sesión")
    }

    val mensaje = if(age1 >= 18){
        "Mayor de edad"
    } else {
        "Menor de edad"
    }

    println(mensaje)
    println(if(age1 >= 18) "Mayor de edad" else "Menor de edad")
}