public class ForLoop {
    public static void main(String[] args) {

        /*
        for(init statement; kondisi; post statement){
            // block perulangan
           }

           - Init statement dieksekusi di awal sebelum perulangan
           - kondisi dilakukan pengecekan setiap perulangan, jika false akan berhenti
           - post statement dilakukan di akhir setiap perulangan
           - init & post statement tidak wajib diisi, jika kondisi tidak diisi berarti kondisi selalu bernilai true
         */



        /*
        // Perulangan Tanpa Henti
        for(;;){
            System.out.println("perulangan " + counter);
            counter++;
        }*/

        /*
        // Perulangan dengan kondisi
        for(; counter <= 10 ;){
            System.out.println("perulangan ke-" + counter);
            counter++;
        }*/

        // Perulangan dengan init statement
        for(var counter =1; counter <=10; counter++){
            System.out.println("perulangan ke " + counter);
        }
    }
}
