fun main(args:Array<String>) {
    var input = readLine()!!.split(" ").map{ it.toString() }
    if(input.contains("R")){
        println("R")
    } else if(input.contains("B")){
        println("B")
    } else {
        println("G")
    }
}
