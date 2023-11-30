package tuan1

import kotlin.math.pow
import kotlin.math.sqrt

/*5.Viết chương trình giải phương trình bậc 2: ax2 + bx + c = 0.*/
fun main(args: Array<String>) {
    println("Nhap a")
    var a:Double? = readLine()?.toDouble()
    println("Nhap b")
    var b:Double? = readLine()?.toDouble()
    println("Nhap b")
    var c:Double? = readLine()?.toDouble()
    if (a!=null&&b!=null&&c!=null){
        giaiPt(a,b,c)
    }
}

fun giaiPt(a:Double, b:Double, c:Double){
    var deta : Double = b.pow(2)-(4*a*c)
    if(deta < 0){
        println("Phương trình vô nghiệm")
    }else if (deta==0.0){
        println("Phương trình có nghiệm kép x1 = x2 = ${-b/(2*a)}")
    }
    else{
        var  x1:Double = (-b+sqrt(deta)).div(2*a)
        var x2:Double  = (-b- sqrt(deta)).div(2*a)
        println("Phương trình có 2 nghiệm phân biệt x1 = $x1 và x2 = $x2" )

    }
}