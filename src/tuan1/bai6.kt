package tuan1/*6. Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu:
Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
▪	Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
▪	Cấp kỹ sư có thuộc tính riêng: Ngành đào tạo.
▪	Các nhân viên có thuộc tính riêng: công việc.
Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
▪	Thêm mới cán bộ.
▪	Tìm kiếm theo họ tên.
▪	Hiện thị thông tin về danh sách các cán bộ.
▪	Thoát khỏi chương trình.
*/
fun main(args: Array<String>) {
   // var  quanLyCanBo :QuanLyCanBo
    val qlcb = QuanLyCanBo()
    println("Nhập vào lựa chọn của bạn")
    var nhap:Int = readln().toInt()

    if (nhap!=null){
        do {
            when(nhap){
                1 -> {
                    println("Nhap họ ten: " )
                    var ten:String= readln()
                    println("Nhap tuoi: " )
                    var tuoi:Int= readln().toInt()
                    println("Nhap gioi tinh: " )
                    var gioiTinh:Int= readln().toInt()
                    println("Nhap dia chi: " )
                    var diaChi:String= readln()
                    var canBo = CanBo(ten,tuoi,gioiTinh,diaChi)
                    qlcb.themMoiCanBo(canBo)
                }
                2->qlcb.hienThiDanhSach()
                3->{
                    println("Nhap ten can bo muon tim: ")
                    var ten:String= readln()
                    qlcb.timKiemTheoHoTen(ten)
                }
                0-> println("Thoát khỏi chương trình")
                else-> println("Lỗi cú pháp")
            }
        }while (nhap!=0)
    }

   /* val qlcb = QuanLyCanBo()
    val congNhan = CongNhan("Nguyen Van A", 30, 1, "Ha Noi", 5)
    val kySu = KySu("Tran Thi B", 28, 2, "Ho Chi Minh", "Khoa hoc may tinh")
    val nhanVien = NhanVien("Pham Van C", 25, 3, "Da Nang", "Bao ve")

    // Thêm cán bộ mới vào danh sách
    qlcb.themMoiCanBo(congNhan)
    qlcb.themMoiCanBo(kySu)
    qlcb.themMoiCanBo(nhanVien)
    println(qlcb::class.java.typeName)
    qlcb.hienThiDanhSach()*/
}