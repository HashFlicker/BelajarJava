public class BreakContinue {
    public static void main(String[] args) {
        /*
            Break untuk menghentikan case pada swtich
            Continue untuk menghentikan perulangan saat ini lalu melanjutkan ke perulangan selanjutnya
         */

        var counter = 1;

        System.out.println("===Break===");
        while (true){
            System.out.println("perulangan : " + counter);

            counter++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("perulangan berhenti");

        System.out.println("===Continue===");
        for (counter = 1; counter <= 10; counter++){
            if(counter % 2  == 0){
                continue;
            }
            System.out.println("perulangan Ganjil" + counter);
        }

        System.out.println("Perulangan Ganjil Berhenti");




    }
}
