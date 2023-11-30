package tuan1

open   class CanBo {
      var hoTen :String= " "
      var tuoi :Int = 0
      var gioiTinh :Int = 0
      var diaChi :String = " "
     //Hàm trừ tượng
     public  open fun ThongTin():String{
         return "Công nhân - Họ tên: $hoTen, Tuổi: $tuoi, Giới tính: $gioiTinh, Địa chỉ: $diaChi"
     }
     constructor(hoTen:String, tuoi:Int,gioiTinh:Int, diaChi:String)
     {
         this.hoTen = hoTen
         this.tuoi =tuoi
         this.gioiTinh= gioiTinh
         this.diaChi = diaChi
     }

 }