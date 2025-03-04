fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map(String::toInt)
        if(y==x)
            println(0)
        else{
            for(i in 1 until 100001){
                y+=i
                if(y>=x){
                    println(i)
                    break
                }
            }
        }
    }
}
