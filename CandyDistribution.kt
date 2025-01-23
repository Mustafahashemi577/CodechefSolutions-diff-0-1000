fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,m)= readLine()!!.split(" ").map(String::toInt)
        if(n%m==0&&(n/m)%2==0)
            println("Yes")
        else
            println("No")
        
    }
}
