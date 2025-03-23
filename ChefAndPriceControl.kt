fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(n,k) = readLine()!!.split(" ").map(String::toInt)
        val a = readLine()!!.split(" ").map{ it.toInt() }
        var loss = 0
        for(i in 0 until n){
            if(a[i]>k){
                loss+=(a[i]-k)
            }
        }
        println(loss)
    }
}
