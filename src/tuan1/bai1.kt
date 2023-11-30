package tuan1/*1.Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
 nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi trên một dòng,
  cách nhau bằng dấu phẩy.*/
fun main(args: Array<String>) {
    for (i in 10..200){
        if ((i%7 == 0).and(i%5!=0 )){
            print("$i ,")
        }
    }
}