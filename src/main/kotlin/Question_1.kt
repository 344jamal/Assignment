import kotlin.math.sqrt

fun main(){
    //solve the equation x2+10x+25
    val a = 1
    val b = 10
    val c = 25
    val x = (-b+ sqrt((b*b-4*a*c).toDouble()))/2*a
    val y = (-b- sqrt((b*b-4*a*c).toDouble()))/2*a
    println("x = $x")
    println("y = $y")


}