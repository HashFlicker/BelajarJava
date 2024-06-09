public class KonversiTipeDataNumber {

    public static void main(String[] args) {
        /*
          Konversi Tipe Data Number
          widening casting (otomatis) = byte > short > int > long > float > double
          Narrowing casting (manual) = double > float > long > int > short > byte
        */

        // Otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        System.out.println(iniInt);

        // Manual
        // Jika data melebihi kapasitas tipe Data akan terjadi Data Overflow
        // Data akan ditambah hingga penuh & mengulang dari awal hingga sesuai dengan data sebelumnya
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniByte2);



    }
}
