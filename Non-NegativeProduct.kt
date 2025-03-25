import java.util.*
fun main(){
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    repeat(t){
        var n = scan.nextInt()
        val list = ArrayList<Int>()
        var negative = 0
        for(i in 0 until n){
            val temp = scan.nextInt()
            list.add(temp)
            if(temp<0)
                negative++
        }
        if(list.contains(0)||negative%2==0)
            println(0)
        else 
            println(1)
    }
}
