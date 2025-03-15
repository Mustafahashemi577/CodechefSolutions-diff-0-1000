fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(x,y,z,a,d) = readLine()!!.split(" ").map(String::toInt)
        if(x>=z*d && y >= a*d)
            println("YES")
        else
            println("NO")
    }
}
