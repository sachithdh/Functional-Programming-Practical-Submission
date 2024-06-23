object Q2{
    def main(args: Array[String]): Unit = {
        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Float = 4.3f
        
        // - -b * a + c *d - -
        b -= 1
        println(s"--b * a + c * d-- => ${b* a + c *d}") // Ommit d -1 because what d-- do is just decrease the val of d
        d -= 1

        // a++
        println(s"a++ => $a")
        a += 1

        // –2 * ( g – k ) +c
        // println(s"-2 * (g - k)+c => ${-2 * (g - k)+c}")

        // c=c++
        println(s"$c")
        c += 1

        // c=++c*a++
        c += 1
        c = c * a
        println(s"${c}")
        a += 1

        
    }
}