fun main() {
    //  penggunaan type data

    var a:Byte = 123 // max pengunaan byte adalah 128

    var b:Short = 32767 // max pengunaan Short adalah 32768

    var c:Int = 11231231 // max pengunaan int adalah (2^31-1)

    var d:Long = 12312312312312123 // max pengunaan long adalah (2^63 -1)

    var oneMilion = 1_000_000// garis bawah (underscore) digunakan untuk mempermudah dibaca

    var f:Int = 100
    var g:Int = 100
    println(f === g)// hasilnya true karena hasil sama merepresentasikan hasil yang sama


    var h:Int =1
    var i:Long = h.toLong()//contoh konversi eksplisit

    var text = """
        for (c in "foo")
        ayam
    """.trimIndent() //contoh pengguanaan triple quotes

    var j = "ayam"
    println("ayam $j") // contoh pengguanaan string template


}