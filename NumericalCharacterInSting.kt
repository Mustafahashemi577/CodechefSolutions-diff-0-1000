fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var a = readLine()!!
        var result = false
        for(j in 0 until a.length){
            if(a[j]=='5'||a[j]=='0'){
                result=true
                break
            }
        }
        if(result)
            println("Yes")
        else
            println("No")
        
    }
}
