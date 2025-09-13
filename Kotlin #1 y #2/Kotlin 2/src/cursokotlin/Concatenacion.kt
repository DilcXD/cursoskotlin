package cursokotlin

val nombre = "David"
val age = 19
val dinero = 25.50

fun main(){
    val resultado = "Su nombre es " + nombre + " y tiene " + age + " años de edad, posees esta cantidad de dinero \$$dinero"
    val ruta = """C:\Users\David Laguna\Desktop\Clases UNP\2025\II Semestre\Desarrollo de Aplicaciones V"""
    val info = """
        Nombre: $nombre
        Edad: $age
        Dinero: $dinero
    """.trimIndent()

    println(resultado)
    println(ruta)
    println(info)
}