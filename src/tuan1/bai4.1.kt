package tuan1/*Nhap tay*/
import java.lang.NumberFormatException

/*4.Viết chương trình nhập vào mảng A có n phần tử, các phần tử là số nguyên lớn hơn 0 và nhỏ hơn 100. Thực hiện các chức năng sau:
a) Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu tiên tìm được).
b) Sắp xếp mảng theo thứ tự tăng dần.
c) Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính tăng dần cho mảng A.
*/

fun main(args: Array<String>) {
/*1. Khởi tạo mảng*/
    println("Nhap n: ")
    var n :String = readln()
    do {
        if (check(n) ==false) {
            println("Cu phap khong dung, nhap lai")
        }
    }while (checkIsNum(n) ==false)
    var phantu = n.toInt()
    var MangA:IntArray = IntArray(phantu)
    for (i in MangA.indices){
        print("Nhap phan tu thu ${i+1} la: ")
        var x :String = readln()
        MangA[i] = x.toInt()
    }
/*//mang sau khi duyet
    println("Mang sau khi duyet là ")
    for(i in MangA.indices){
        print("${MangA[i]}\t")
    }
*//*a) Tìm phần tử lớn thứ nhất và lớn thứ 2 trong mảng với các chỉ số của chúng (chỉ số đầu tiên tìm được).*//*
    MangA.sortDescending()
    println("\nPhan tu lơn nhat trong mang la: ${MangA.first()}")
    println("Phan tu lơn thu 2 trong mang la: ${MangA[1]}")
*//*b) Sắp xếp mảng theo thứ tự tăng dần.*//*
    MangA.sort()
    println("Mang theo thu tu tang dan la:")
    for (i in MangA.indices){
        print("${MangA[i]}\t")
    }*/
/*c) Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính tăng dần cho mảng A.*/
    var ds:MutableList<Int> = mutableListOf()
    for (i in MangA.indices){
        ds.add(MangA[i])
    }
    println(ds)
    println("Nhap gi tri x ")
    var x:String = readln()
    ds.add(x.toInt())
    ds.sort()
    println("sau khi them phan tu x la: $ds")
    MangA = ds.toIntArray()
    println("Mang A sau khi them moi la:")
    for (i in MangA.indices){
        print("${MangA[i]}\t")
    }
}

fun check(a:String):Boolean{
    return try {
        a.toDouble()
        true
    }catch (e : NumberFormatException){
        false
    }
}

