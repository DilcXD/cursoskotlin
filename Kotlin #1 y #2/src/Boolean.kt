fun main(){
    val llueve: Boolean = true
    val nublado: Boolean = true
    val haceFrio: Boolean = true

    //OR - disyuncion
    if(llueve || haceFrio){
        println("No voy a salir a pasear")
    }

    // AND - conjuncion
    if(nublado && haceFrio){
        println("Seguramente llueva")
    }

    // NOT - negacion
    if(!llueve){
        println("No necesito el paraguas")
    }
}