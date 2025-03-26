fun main(){
    val n = readLine()!!.toInt()
    repeat(n){
        val a = readLine()!!.split(" ").map{it.toInt()}
        val score = a.sum()
        when(score){
            0 -> println("Beginner")
            1 -> println("Junior Developer")
            2 -> println("Middle Developer")
            3 -> println("Senior Developer")
            4 -> println("Hacker")
            5 -> println("Jeff Dean")
        }
    }
    
}
