fun main() {
    print("Nilai x = ")
    val x = readLine()!!.toInt()
    fungsi(x)
}

fun fungsi(x: Int) {
    val hitung = 2*(x*x)+5*x-8
    print(hitung)
}