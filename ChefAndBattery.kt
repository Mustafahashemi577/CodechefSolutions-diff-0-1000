fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        var count = 0
        while(n>50 || n<50) {
		       if(n>50) {
		           n-=3;
		           count++;
		       }
		       if(n<50) {
		           n+=2;
		           count++;
		       }
		    }
		    println(count)
    }
}
