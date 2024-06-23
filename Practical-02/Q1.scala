object Q1{
    def main(args: Array[String]): Unit = {

        var i, j, k: Int = 2
        var m, n: Int = 5
        var f, g: Float = 12.0f
        var c: Char = 'X'

        println(s"k + 12 * m => ${k + 12 * m}")
        println(s"m / j => ${m / n}")
        println(s"n % j => ${n%j}")
        println(s"m / j * j => ${m / j * j}")
        println(s"f + 10*5 + g => ${f + 10 * 5 + g}")

        i += 1
        println(s"++i * n => ${i * n}")
    }
}

