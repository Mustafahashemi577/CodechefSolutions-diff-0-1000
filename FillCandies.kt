fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,k,m)=readLine()!!.split(" ").map(String::toInt)
        var packet=0
        var box=0
        if(n%k==0)
            packet=n/k
        else
            packet=n/k+1
        if(packet%m==0)
            box=packet/m
        else
            box=packet/m+1
        println(box)
    }
}
