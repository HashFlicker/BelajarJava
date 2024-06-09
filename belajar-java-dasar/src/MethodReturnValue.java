public class MethodReturnValue {
    public static void main(String[] args) {

        /*
            secara default, method tidak menghasilkan value apapun, tapi
            kita bisa menambahkan nilai pada sebuah method.

            kita harus mengubah kata kunci void dengan tipe data yang akan dihasilkan

            kita harus menggunakan kata kunci return yang diikuti dengan data yang sesuai dengan
            tipe data yang dideklarasikan di method

            kita hanya bisa menghasilkan satu data di method
         */
        int angka1 = 14;
        int angka2 = 18;

        var result1 = sum(100,14);
        System.out.println(result1);

        System.out.println(hitung(15,"+", 18));
        System.out.println(hitung(15,"-", 18));
        System.out.println(hitung(15,"*", 18));

        System.out.println("ini apel punya " + pemilik("gweh", "Brata", " bagus"));
        System.out.println("ini jeruk punya " + pemilik("dia", "Pace", " Syawal"));
        System.out.println("ini Kondom punya " + pemilik("Mereka", "Pace", " Syawal"));

        System.out.println();

    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operator, int value2){

        switch(operator){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default :
                return 0;
        }
    }


    static String pemilik(String siapa, String firstName, String lastName){
        switch (siapa){
            case "gweh" :
                return  firstName + lastName;
            case "dia" :
                return  firstName + lastName;
            default :
                return ".......kga tau dah";
        }

    }


}
