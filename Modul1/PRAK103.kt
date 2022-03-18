fun main() {
    print("Nilai bilangan = ")
    var nilai = readLine()!!.toInt()
    var kelipatan = nilai
    hitungan(nilai, kelipatan)
}

fun hitungan(nilai: Int, kelipatan: Int) {
    var nilai = nilai

    for (i in 1..7){
        nilai += kelipatan
        if (nilai % 2 == 0 || nilai % 3 == 0){
            print("$nilai ")
        }
    }
}