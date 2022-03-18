import kotlin.math.roundToInt
import kotlin.random.Random

fun main() {
    println("Waktu Sekarang: ")
    val waktu = readLine()
    println("Nama Anda: ")
    val nama = readLine()
    println("Umur Anda: ")
    val umur = readLine()

    println("Suhu Anda: ")
    var suhu = readLine()
    val valueRandom =  String.format("%.2f",Random.nextDouble(suhu!!.toInt().toDouble(), 37.00))
    println("Suhu Anda: $valueRandom")
}
