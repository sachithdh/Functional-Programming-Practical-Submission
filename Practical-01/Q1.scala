object Q1{
    val PI = 3.14

    // Calculate the area of a disk
    def areaOfDisk(r: Double): Double = PI * r * r


    def main(args: Array[String]): Unit = {
        println("Area of a disk with radius 5" + areaOfDisk(5))
    }
}
