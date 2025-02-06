fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,n) = readLine()!!.split(" ").map(String::toInt)
        if(n>(x*100)){
            if(n%100==0)
                println((n-(x*100))/100)
            else
                println((n-(x*100))/100+1)
        }
        else
            println(0)
    }
}
