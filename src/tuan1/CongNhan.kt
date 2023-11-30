package tuan1

class CongNhan: CanBo {
    protected var capBac:Int = 0
    constructor(hoTen:String, tuoi:Int,gioiTinh:Int, diaChi:String,capBac:Int):super(hoTen,tuoi,gioiTinh,diaChi){
        this.capBac = capBac
    }
    override fun ThongTin(): String {
        return "Công nhân - Họ tên: $hoTen, Tuổi: $tuoi, Giới tính: $gioiTinh, Địa chỉ: $diaChi, Bậc: $capBac"
    }


}