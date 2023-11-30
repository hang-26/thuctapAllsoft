package tuan1

class TamGiac: DaGiac {
    constructor(soCanh:Int, kichThuoc:List<Double>):super(3,kichThuoc)
    override fun tinhChuVi(): Double {
        return super.tinhChuVi()
    }

    fun dienTich():Double{
        val p = tinhChuVi().toDouble() / 2

        val dienTich = Math.sqrt(p * (p - kichThuoc[0]) * (p - kichThuoc[1]) * (p - kichThuoc[2]))
        return dienTich
    }
}