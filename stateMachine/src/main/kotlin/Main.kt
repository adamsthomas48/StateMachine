import Float.FloatDetector

fun main(args: Array<String>) {
    val detector = IntegerDetector()

    println(detector.detect("123"))
    println(detector.detect("0123"))
    println(detector.detect("123a4"))
    println(detector.detect("123234985723495872345"))
    println(detector.detect("1"))
    println(detector.detect("0"))
    println(detector.detect(""))

    val floatDetector = FloatDetector()

    println(floatDetector.detect("123.45"))
    println(floatDetector.detect("123.45a"))
    println(floatDetector.detect("123.45.6"))
    println(floatDetector.detect(".45"))


}