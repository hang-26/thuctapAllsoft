package tuan1

open class DaGiac {
    var soCanh:Int=0
    var kichThuoc:List<Double> = listOf()

    constructor(soCanh:Int, kichThuoc:List<Double>){
        this.soCanh = soCanh
        this.kichThuoc =kichThuoc
    }

    open  fun tinhChuVi():Double{
        return kichThuoc.sum()
    }
    fun inCacCanh() {
        println("Các cạnh của đa giác:")
      /*  for ((index, kichThuoc) in kichThuoc.withIndex()) {
            println("Cạnh ${index + 1}: $kichThuoc")
        }*/
        for (i in kichThuoc.indices){
            print("${kichThuoc[i]} \t")
        }
    }



}