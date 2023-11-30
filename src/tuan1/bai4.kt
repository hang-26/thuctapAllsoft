package tuan1

import java.lang.NumberFormatException
import kotlin.random.Random

/*4.Viết chương trình nhập vào mảng A có n phần tử, các phần tử là số nguyên lớn hơn 0 và nhỏ hơn 100. Thực hiện các chức năng sau:
a) Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu tiên tìm được).
b) Sắp xếp mảng theo thứ tự tăng dần.
c) Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính tăng dần cho mảng A.
*/
/*Lam theo mang ran dom*/
fun main(args: Array<String>) {
/*1. Khởi tạo mảng*/
    println("Nhap n: ")
    var n :String = readln()
    do {
        if (checkIsNum(n) ==false) {
            println("Cu phap khong dung, nhap lai")
        }
    }while (checkIsNum(n) ==false)
    var phantu = n.toInt()
//    println(phantu)
    var rd = Random
    var MangA:IntArray = IntArray(phantu)
   for (i in MangA.indices){
        MangA[i] = rd.nextInt(100)
    }
//mang sau khi duyet
    println("Mang sau khi duyet là ")
    for(i in MangA.indices){
        print("${MangA[i]}\t")
    }
/*a) Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu tiên tìm được).*/
    var MangB = MangA.clone()
    MangB.sortDescending()
    println("\n2 phan tu lon nhat trong mang la ${MangB[0]} va ${MangB[1]}")
    println("Phan tu lơn nhat trong mang la ${MangB.first()}")
/*b. Mang theo thu tu tang dan */
    MangB.sort()
    print("Mang theo thu tu tang dan la: ")
    for (i in MangB.indices){
        print("${MangB[i]}\t")
    }
/*c) Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính tăng dần cho mảng A.*/
    println("Nhap so nguyen x vao mang A")
}

fun checkIsNum(a:String):Boolean{
    return try {
        a.toDouble()
        true
    }catch (e : NumberFormatException){
        false
    }
}