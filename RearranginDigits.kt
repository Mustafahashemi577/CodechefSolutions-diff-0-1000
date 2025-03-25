fun main(){
    repeat(readLine()!!.toInt()){
        val digits = readLine()!!.toInt()
        val number = readLine()!!.toCharArray()
        var result = false
        for(i in 0 until digits){
            if(number[i]=='5'||number[i]=='0'){
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
