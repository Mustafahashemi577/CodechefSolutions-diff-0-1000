fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,x) = readLine()!!.split(" ").map(String::toInt)
        println((n-(n/3))*x)        
    }
}
