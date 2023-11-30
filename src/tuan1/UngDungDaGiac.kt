package tuan1

class UngDungDaGiac {
    private val danhSachTamGiac:MutableList<TamGiac> = mutableListOf()

    //Nhập thông tin cho từng tam giác

    fun themThongTinTamGiac(){

//            println("Nhap thong tin cho tam giac thú $i\n")
            println("cạnh thứ 1: ")
            var canh1:Double = readln().toDouble()
            println("cạnh thứ 2: ")
            var canh2:Double = readln().toDouble()
            println("cạnh thứ 3: ")
            var canh3:Double = readln().toDouble()
            danhSachTamGiac.add(TamGiac(3, kichThuoc = listOf(canh1,canh2,canh3)))

    }
    fun inDanhSachCacTamGiac(){
        danhSachTamGiac.forEach {
            println(it.inCacCanh())
            println("Diện thích là: ")
            println(it.dienTich())
        }
    }

    fun timKiemTamGiac(){
        println("Nhap vào vị trí muốn xem")
        var viTri :Int = readln().toInt()
        if (viTri<danhSachTamGiac.size){
            println(danhSachTamGiac[viTri].inCacCanh())
        }
    }

    fun xoaTamGiac(){
        println("Nhap vào vị trí muốn xem")
        var viTri :Int = readln().toInt()
        if (viTri<danhSachTamGiac.size){
            danhSachTamGiac.removeAt(viTri)
        }
    }

    fun tamGiacLonNhat(){
        var tamGiacLonNhat  = danhSachTamGiac.maxByOrNull{ it.dienTich() }//Tìm ra tam giac có Diện tích lớn nhất
        println(tamGiacLonNhat?.inCacCanh())
        println(tamGiacLonNhat?.dienTich())
    }

    fun sapXepMang(){
        return danhSachTamGiac.sortBy { it.dienTich() }
    }
}