public class DoWhileLoop {
    public static void main(String[] args) {

        // Pengecekan kondisi dilakukan di akhir perulangan
        // Setidaknya perulangan akan dilakukan satu kali ketika data bernilai false

        var counter = 100;

        do{
            System.out.println("Perulangan : " + counter);
            counter++;

        } while (counter < 10);


    }
}
