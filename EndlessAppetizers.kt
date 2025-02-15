fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y,r) = readLine()!!.split(" ").map(String::toInt)
        var plates = 0
        if((x+r/30)%y==0)
             plates = (x+r/30)/y
        else
            plates = (x+r/30)/y+1
        println(plates)       
    }
}
