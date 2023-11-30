package tuan1

class NhanVien: CanBo {
    private var congViec:String =""
    constructor(hoTen:String,tuoi:Int, gioiTinh:Int,diaChi:String,congViec:String):super(hoTen,tuoi,gioiTinh,diaChi){
        this.congViec = congViec
    }

    override fun ThongTin(): String {
        return "Công nhân - Họ tên: $hoTen, Tuổi: $tuoi, Giới tính: $gioiTinh, Địa chỉ: $diaChi, Bậc: $congViec"
    }

}