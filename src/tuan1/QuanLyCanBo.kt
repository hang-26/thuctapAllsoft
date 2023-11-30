package tuan1

class QuanLyCanBo {
    private val danhSachCanBo:MutableList<CanBo> = mutableListOf()
     fun themMoiCanBo(canBo: CanBo) {
         danhSachCanBo.add(canBo)
     }
     fun timKiemTheoHoTen(hoTen: String): List<CanBo> {
         return danhSachCanBo.filter { it.hoTen.contains(hoTen, ignoreCase = true) }
     }

     fun hienThiDanhSach()
    {
        println(danhSachCanBo::class.java.typeName)
       /* for (i in danhSachCanBo.indices){
            println(danhSachCanBo[i].getTen())
        }*/
        danhSachCanBo.forEach {
            println(it.hoTen)
        }

    }
 }