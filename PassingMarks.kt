fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val a = readLine()!!.split(" ").map { it.toInt() }
        if (a[4] >= a[0] && a[5] >= a[1] && a[6] >= a[2] && (a[4] + a[5] + a[6]) >= a[3]) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

