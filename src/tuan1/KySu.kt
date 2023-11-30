package tuan1

class KySu: CanBo {
    private var nganhDaoTao:String=""
    constructor(hoTen:String,tuoi:Int, gioiTinh:Int,diaChi:String,nganhDaoTao:String):super(hoTen,tuoi,gioiTinh,diaChi)
    {
        this.nganhDaoTao = nganhDaoTao
    }

    override fun ThongTin(): String {
        return "Công nhân - Họ tên: $hoTen, Tuổi: $tuoi, Giới tính: $gioiTinh, Địa chỉ: $diaChi, Bậc: $nganhDaoTao"
    }

}