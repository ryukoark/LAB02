package Acuario

fun construirAcuario() {

    println("____________________________")
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}



fun main() {
    construirAcuario()
}
