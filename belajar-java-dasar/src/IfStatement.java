public class IfStatement {
    public static void main(String[] args) {

        var nilai = 90;
        var absen = 90;

        var NilaiLulus = nilai >= 75;
        var AbsenLulus = absen >= 75;

        var lulus = NilaiLulus && AbsenLulus;

        if(nilai >= 75 && absen >= 75){      // Jika data bernilai true akan dieksekusi
            System.out.println("Selamat Anda Lulus");
        } else{     // Jika data bernilai false akan dieksekusi
            System.out.println("silahkan dicoba lagi\n");
        }

        if(nilai >= 90 && absen >= 90){
            System.out.println("Nilai anda A");
        } else if(nilai >= 80 && absen >= 80){
            System.out.println("Nilai Anda B");
        } else if(nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda C");
        } else if(nilai >= 60 && absen >= 60){
            System.out.println("Nilai Anda D");
        } else{
            System.out.println("LU GAGAL NGNTD !!!");
        }


    }
}
