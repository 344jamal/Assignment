import kotlin.math.*
fun main(){
    println("Please enter the route")
    val route = readln().toString()
    var s = 20
    val d1 = 5000
    val t1 = d1/s.toDouble()

    val d2 = 25000
    val t2 = d2/s.toDouble()

    val d3 = 50000
    val t3 = d3/s.toDouble()

    val d4 = 10000
    val t4 = d4/s.toDouble()
    when(route){
        "route1"-> println("The person will take $t1"+"hours")
        "route2"-> println("The person will take $t2"+"hours")
        "route3"-> println("The person will take $t3"+"hours")
        "another route"-> println("The person will take $t4"+"hours")
        else-> println("unknown route")
    }
}