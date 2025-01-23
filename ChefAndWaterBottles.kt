fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,x,k)=readLine()!!.split(" ").map(String::toInt)
        if(k/x>n)
            println(n)
        else
            println(k/x)
    }
}
