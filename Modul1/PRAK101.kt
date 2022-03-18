import kotlin.random.Random

fun main() {
    print("Waktu Sekarang: ")
    val waktu = readLine()
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()

    print("Suhu Anda: ")
    var suhu = readLine()
    val valueRandom =  String.format("%.2f",Random.nextDouble(suhu!!.toInt().toDouble(), 37.00))
    println("Selamat Pagi, $nama. Umur anda $umur Tahun \nSuhu Tubah anda $valueRandom derajat Celcius")
}
