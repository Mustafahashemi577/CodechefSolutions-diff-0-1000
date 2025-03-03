fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(n,x,y,a,b) = readLine()!!.split(" ").map(String::toInt)
        var petrol = (n+0.0)/a*x
        var diesel = (n+0.0)/b*y
        if(petrol<diesel)
            println("PETROL")
        else if (petrol==diesel)
            println("ANY")
        else
            println("DIESEL")
    }
}
