fun main(){

    val password = "uxatuij"

    when(password.length){
        0 -> println("Contraseña vacía")
        1,2,3,4 -> println("Contraseña muy débil")
        5,6 -> println("Contraseña débil")
        else ->  println("Contraseña segura")
    }

    esPar(1400)
}

fun esPar(numero: Int) = when(numero % 2) {
    0 -> println("El número es par")
    else ->  println("El número es impar")
}