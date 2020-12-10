fun main() {
    var name: String = "Hassan";
    name = "Salumu"
    var age: Float = 34450.25F;
    println("My name is ${name}, I'm ${age} years old")

    // arrays
    val names = arrayOf("Juma", "Ally", "Hassan")
    println("The first element is: ${names[1]}")
    println("The last element is : ${names.last()}")

    val asc = Array(5) { i ->
        (i * 1).toString();
    }

    asc.forEach { println(it) }

    val x: IntArray = intArrayOf(14, 12, 2)
    x.forEach { println(it) }

    for (data in x) {
        println("output inside for loop ${data}");
    }

    // Ranges
    for (i in 1..10) {
        println(i);
    }

    for(i in 1 until 10){
        println("number: "  + (i ))
    }

    for(i in 10 downTo  2 step 2){
        println("hello $i")
    }



}