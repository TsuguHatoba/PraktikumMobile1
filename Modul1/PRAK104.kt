fun main() {
    val olahraga = olahragaClass()
    olahraga.Olahraga()
}

class olahragaClass(var namaOlahraga: String = "Tenis Meja", val mulaiSuka : Int = 12){
    fun Olahraga() {
        println("""
            Olahraga Kesukaan? $namaOlahraga
            Sejak Kapan Suka? Tahun $mulaiSuka 
        """.trimIndent())

    }
}