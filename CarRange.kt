fun main(){
    repeat(readLine()!!.toInt()){
        var (p,m,v) = readLine()!!.split(" ").map(String::toInt)
        println((m-(p-1))*v)
    }
}
