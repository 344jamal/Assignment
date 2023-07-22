import kotlin.math.sqrt

fun main(){
    // solve the equation x3+7x2+10x = 0
    //first factor out x -> x(x2+7x+10) = 0
    //then solve them separately
    //like either x = 0  or x2+7x+10 = 0
    val x1 = 0
    val a = 1
    val b = 7
    val c = 10
    val x2 = (-b+ sqrt((b*b-4*a*c).toDouble()))/2*a
    val x3 = (-b- sqrt((b*b-4*a*c).toDouble()))/2*a
    println("x1 = $x1")
    println("x2 = $x2")
    println("x3 = $x3")

}