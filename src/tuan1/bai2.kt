package tuan1/*2.Viết chương trình liệt kê các số Fibonacci
 nhỏ hơn n và là số nguyên tố trong Java. N là số nguyên dương được nhập từ bàn phím.*/
fun main(args: Array<String>) {
    println("Nhap so nguyen n")
    var n :String= readln()
    var a = n.toInt()
    var t1:Int = 0
    var t2 :Int =1
    for (i in 1..a){
        var sum =t1+t2
        t1 = t2
        t2 =sum
        println("t1 la: $t1" )
    }
}