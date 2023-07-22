fun main(){

    println("Please enter the route:")
    val route = readln().toString()
    if (route == "route1"){
        val s = 20
        val d = 5000
        val t = d/s.toDouble()
        println("The person will take $t"+"hours")
    }else if (route == "route2"){
        val s = 20
        val d = 25000
        val t = d/s.toDouble()
        println("The person will take $t"+"hours")

}else if (route == "route3"){
        val s = 20
        val d = 50000
        val t = d/s.toDouble()
        println("The person will take $t"+"hours")

}else if (route == "another route"){
        val s = 20
        val d = 10000
        val t = d/s.toDouble()
        println("The person will take $t"+"hours")
}}