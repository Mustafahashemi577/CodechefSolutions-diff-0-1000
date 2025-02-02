fun main () {
    repeat(readln().toInt()){
        var (x , y) = readln().split(" ").map(String::toInt)
        var p = (x+y)%4
        when (p) {
            0,1 ->println("Alice")
            3,2 ->println("Bob")
        }
    }
}
