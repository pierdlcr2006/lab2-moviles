package acuario


fun main(){
    crearPeces()
}

fun crearPeces(){
    val tiburon : Tiburon = Tiburon()
    val pezPayaso : PezPayaso = PezPayaso()
    println("Tiburon con color: ${tiburon.color}, Pez payaso con color: ${pezPayaso.color}")
    tiburon.comer()
    pezPayaso.comer()
}







fun construirAcuario(){

//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()
//    val acuario2 = Acuario(ancho = 50)
//    acuario2.imprimirTamano()
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()
//    val acuario6 : Acuario = Acuario(numeroDePeces = 29)
//    acuario6.imprimirTamano()
//    val acuario7 : Acuario = Acuario(numeroDePeces = 29)
//    acuario7.imprimirTamano()
//    acuario7.volumen = 70
//    acuario7.imprimirTamano()
//    val acuario8 : Acuario = Acuario(largo = 25, ancho = 25, alto = 40)
//    acuario8.imprimirTamano()

    val miAcuario : Acuario = Acuario(ancho = 25, largo = 25 , alto = 40)
    miAcuario.imprimirTamano()
    val miTorre : TanqueTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

