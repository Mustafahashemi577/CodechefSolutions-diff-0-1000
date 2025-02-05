fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,a,b) = readLine()!!.split(" ").map(String::toInt)
        var sum = 0;
        for(i in 1..n){
            if(i%2==1)
                sum+=b
            else
                sum+=a
        }
        println(sum)
    }
}
