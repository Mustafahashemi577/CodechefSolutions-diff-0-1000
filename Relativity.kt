fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (g,c) = readLine()!!.split(" ").map(String::toInt)
        var b = c * c;
		var d = 2 * g;
		println(b/d);
    }
}
