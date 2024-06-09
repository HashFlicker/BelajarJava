public class MethodParameter {
    /*
        Parameter ditempatkan di dalam () pada method yang dibuat
     */

    public static void main(String[] args) {

        sayHello("Brata", "Bagus");

    }

    static void sayHello(String firstname,String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}
