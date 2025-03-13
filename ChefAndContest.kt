fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y,p,q) = readLine()!!.split(" ").map(String::toInt)
        var chef = x+p*10
        var chefina = y+q*10
        if(chefina==chef)
            println("Draw")
        else if (chef<chefina)
            println("Chef")
        else
            println("Chefina")
    }
}
