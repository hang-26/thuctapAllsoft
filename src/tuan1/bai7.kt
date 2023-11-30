package tuan1/*
7. Chương trình tính diện tích đa giác:
Hãy xây dựng lớp DaGiac gồm có các thuộc tính: Số cạnh của đa giác, Mảng các số nguyên chứa kích thước các cạnh của đa giác. Các phương thức:
Tính chu vi, In giá trị các cạnh của đa giác.
Xây dựng lớp TamGiac kế thừa từ lớp DaGiac, trong đó viết đè các hàm tính chu vi và xây dựng thêm phương thức tính diện tích tam giác.
Các lớp cần phải đảm bảo tính đóng gói và kế thừa.
Xây dựng một ứng dụng để nhập vào một dãy gồm n tam giác rồi in ra màn hình danh sách theo dạng bảng n tam giác.
In ra các cạnh của các tam giác có diện tích lớn nhất.
Tìm kiếm và in ra tam giác theo vị trí (index) nhập vào.
Xóa 1 tam giác tại vị trí nhập vào.
Sắp xếp mảng tam giác tăng dần theo diện tích.
*/
fun main(args: Array<String>) {
    val  daGiac= UngDungDaGiac()
    do {
        println("Nhập vào yêu cầu")
        var nhap:Int = readln().toInt()
        when(nhap){
            1-> daGiac.themThongTinTamGiac()
            2-> daGiac.inDanhSachCacTamGiac()
            3 -> daGiac.timKiemTamGiac()
            4-> daGiac.xoaTamGiac()
            5-> daGiac.tamGiacLonNhat()
            6-> daGiac.sapXepMang()
            else-> println("Chương trình đã thoát")
        }
    }while (nhap!=0)

}