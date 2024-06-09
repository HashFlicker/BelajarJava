public class RecursiveMethod {

    /*
        Recursive Method digunakan untuk memanggil dirinya sendiri

        Recursive method memiliki kekurangan, jika recursive teralalu dalam/ terlalu banyak akan terjadi
        error StackOverflow. Jumlah pastinya tidak diketahui karena menyesuaikan dengan spek perangkat yang digunakan

     */

    public static void main(String[] args) {



        System.out.println(factorialLoop(4));

        // jika mau coba error stack overflow, ganti value sebanyak banyaknya
        System.out.println(factorialRecrusive(1_000_000));


    }

    // tanpa recursive method (looping)
    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;

        }

        return result;

    }

    // dengan recursive method
    static int factorialRecrusive(int value){
        if(value == 1){
            return 1;
        } else{
            return value * factorialRecrusive(value - 1);
        }
    }




}
