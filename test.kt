

import egresos// Declarar variables de lectura y escritura se usa var y puedes cambiar su valor a lo largo del bloque de codigo 
var ingresos= 1000
var egresos= 700
var ahorros= 130
val reporte_mensual= ingresos - egresos - ahorros 
// val hace variables de solo lectura, donde su valor no se alterara
val iva= 2
const  val impuesto= 58


class Perro {
    var nombre: String = ""
    var raza: String = ""
    var edad: Int = 0

    fun ladrar() {
        println("$nombre está ladrando!")
    }

    fun jugar() {
        println("$nombre está jugando felizmente.")
    }
}

fun main() {
    // miPerro es el objeto que se agregara con los comportamientos y caracteristicas de Perro
    val miPerro = Perro() 
    miPerro.nombre = "Max"
    miPerro.raza = "Labrador"
    miPerro.edad = 3

    miPerro.ladrar()
    miPerro.jugar()
    println( " El reporte de gatos mensuales es $reporte_mensual")
}
