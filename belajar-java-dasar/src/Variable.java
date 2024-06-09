public class Variable {
    public static void main(String[] args) {

        // tidak boleh berisi whitespace (spasi,tab,enter) dan tidak boleh seluruhnya angka
        // variabel tidak bisa diisi tipe data lain
        String name;
        name = "Brata Bagus Kharismawan";

        System.out.println(name);


        int age = 19;
        String address = "indonesia";

        System.out.println(age);
        System.out.println(address);


        // mengganti isi variable
        name = "Bret";

        System.out.println(name);

        /* Kata Kunci VAR
            1. Berlaku di versi java 10 ke atas
            2. isi data harus dideklarasikan secara langsung
         */
        var firstName = "Brata";
        var lastName = "Bagus";
        System.out.println(firstName + " " + lastName);

        /*
            Kata Kunci Final
            1. Data tidak dapat diubah setelah pertama kali dibuat, kalau diubah akan terjadi error
         */
        final String application = "Belajar Java";



    }
}
