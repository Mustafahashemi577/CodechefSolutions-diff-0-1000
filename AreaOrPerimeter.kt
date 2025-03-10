fun main(args:Array<String>){
    var l = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var area = l*b
    var peri = 2*(l+b)
    if(area==peri){
        println("EQ")
        println(area)
    }else if (area>peri){
        println("Area")
        println(area)
    }
    else{
        println("Peri")
        println(peri)
    }
}
