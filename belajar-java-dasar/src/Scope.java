import javax.swing.*;

public class Scope {

    /*
        Sebuah variable hanya bisa diakses di dalam blok di mana variable itu dibuat,
        hal ini disebut sebagai Scope

        Jika variable yg dibuat dipanggil di blok lain, maka akan terjadi error
     */

    public static void main(String[] args) {

        sayHello("Brata");
        sayHello("");


        //  percobaan pemanggilan variable di dalam method
        //System.out.println(hello); //error
        //System.out.println(hi); //error

    }

    static void sayHello(String name){
        String hello = "Hello" + name;

        if(!name.isBlank()){
            String hi = "hi " ;
            System.out.println(hi);
        }

        System.out.println(hello);

    }

}
