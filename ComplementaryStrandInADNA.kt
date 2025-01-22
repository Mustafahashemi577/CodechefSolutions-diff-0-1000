fun main(){
    val complement = mapOf('A' to 'T', 'T' to 'A' , 'C' to 'G', 'G' to 'C')
    repeat(readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        val s = readLine()!!.map { complement[it]}.joinToString("")
        println(s)
    }
}

