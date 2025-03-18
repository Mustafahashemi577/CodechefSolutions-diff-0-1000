fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y,z) = readLine()!!.split(" ").map(String::toInt)
        println(x*z-x*y)
    }
}
