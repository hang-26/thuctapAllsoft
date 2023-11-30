package tuan1

/*3.Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau:
a) Tính tổng các chữ số của n.
b) Phân tích n thành tích các thừa số nguyên tố.
c) Liệt kê các ước số của n.
d) Liệt kê các ước số là nguyên tố của n.
*/
fun main(args: Array<String>) {
     println("Nhap vao so nguyen duong n")
     var n: String? = readln()
     //println(n)
     if(n!= null){
         var  a = n.toInt()

         println(a)
        println(a::class.java.typeName )
        println("a. Tinh tong cac so nguyen cua n")
        tinhTongCacSo(a)
        println("b.Phan tich n thanh cac thua so nguyen to")
        phanTichThuaSo(a)
        println("c. Liet ke cac uoc cua n")
        print("Cac uoc cua n la:")
        timUoc(a)

        println("\nd. Liet ke cac uoc cua n la so nguyen to")
        for (i in 1..a){
            if (a%i==0){
                kiemTraSoNguyenTo(i)
            }
        }
    }

}

fun tinhTongCacSo(a :Int){
    var i: Int
    var x :Int = a
    var tong:Int = 0
    while (x > 0){
        i = x%10
        x = x.div(10)
        tong += i

    }
    println("Tong cac chu so cua n la: $tong")

}
fun kiemTraSoNguyenTo(x:Int){
    var dem :Int =0
    for (i in 2 until x){
        if (x% i==0){
            dem++
        }
    }
    if (dem==0){
        println( x )
    }
}

fun timUoc(x:Int){
    var i:Int =1
    while (i>0){
        if (x%i==0){
            print("$i\t")
        }
        i++
    }
}

fun phanTichThuaSo(x:Int){
    var a :Int = x
    var requires :Boolean
     for (i in 2..a){
         while(a%i==0)
         {
             a=a/i;
             if(a==1)
                 System.out.print(i);
             else
                 System.out.print("$i x ");
         }
         if (a==1)
             break;
      }

}

fun soNguyenTo(n:Int):Boolean{
    if (n==2){
        return true
    }
    for(i in 2..n){

        if(n%i == 0){
            return false;
        }
    }
    return true;
}