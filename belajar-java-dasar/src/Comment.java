public class Comment {

    /*
        comment adalah sintaks yang diabaikan dalam eksekusi kode

        komentar biasanya digunakan untuk keperluan dokumentasi
     */

    // komentar menggunakan 2 kata kunci yaitu // dan /* yang ditutup dengan kebalikannya

    public static void main(String[] args) {

        System.out.println(sum(1, 2));


    }

    // contoh standard dokumentasi yang biasanya digunakan developer java
    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */

    static int sum(int value1, int value2){
       // jumlahkan value1 ditambah value2
       return value1 + value2;

    }


}
