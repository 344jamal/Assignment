fun main(){
    println("Please enter your choice:")
    val choice = readln().toString()
    when(choice){
        "Pizza"-> println("PizzaHut")
        "Chicken"-> println("Kfc")
        "Pancake"-> println("FoodHub")
        "Cake"-> println("Cakely")
        else -> println("choice not found")
    }
}