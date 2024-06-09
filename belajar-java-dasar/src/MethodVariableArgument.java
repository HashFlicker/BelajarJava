public class MethodVariableArgument {
    /*
        Method Variable Argumen berguna untuk mengirim data ke method dengan jumlah data yang tidak pasti.
        Biasanya, kita menggunakan array sebagai parameter di method
        Parameter dengan tipe variable argument hanya bisa ditempatkan di posisi akhir parameter
     */

    public static void main(String[] args) {

        int[] nilaiSementara1 = {
                80, 85, 92, 78, 84
        };



        ucapanSelamat("Brata", nilaiSementara1 );
        ucapanSelamat2("Bret", 54,80,76,90,61);



    }

    static void ucapanSelamat(String nama, int[] nilaiSementara) {

        int total = 0;
        for(var value : nilaiSementara){
            total += value;

        }

        int nilaiAkhir = total / nilaiSementara.length;

        if(nilaiAkhir >= 75){
            System.out.println("selamat " + nama + "!!! kamu lulus broo");
        } else{
            System.out.println("kasihan " + nama + " ga lulus deh");
        }

    }

    static void ucapanSelamat2(String nama2, int... nilaiSementara2) {

        int total2 = 0;
        for(var value2 : nilaiSementara2){
            total2 += value2;

        }

        int nilaiAkhir2 = total2 / nilaiSementara2.length;

        if(nilaiAkhir2 >= 75){
            System.out.println("selamat " + nama2 + "!!! kamu lulus broo");
        } else{
            System.out.println("kasihan " + nama2 + " ga lulus deh");
        }

    }


}
