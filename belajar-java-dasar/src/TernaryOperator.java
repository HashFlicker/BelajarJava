public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 75;
        String ucapan;

        // tanpa ternary operator
        if(nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "silahkan Coba Lagi";
        }

        System.out.println(ucapan);

        // Dengan ternary Operator
        nilai = 70;
        ucapan = nilai >=75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println("\n" + ucapan);
    }
}
