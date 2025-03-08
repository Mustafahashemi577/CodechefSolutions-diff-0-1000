fun main() {
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map{ it.toInt() }
        var a = x-y
        if(a > 0){
            println(if(a%2 == 0) a/2 else (a/2)+2)
        }else{
            println(Math.abs(a))
        }   
    }
}
