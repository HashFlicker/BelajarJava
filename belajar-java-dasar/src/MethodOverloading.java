public class MethodOverloading {

    /*
        Method Overloading berfungsi untuk membuat method dengan nama yang sama lebih dari sekali

        Ketentuannya yaitu data parameter di method tersebut harus berbeda, entah jumlah atau tipe data paramenter

        Jika ada yang sama, akan terjadi Error
     */

    public static void main(String[] args) {

        sayHello();
        sayHello("Brata");
        sayHello("Brata", " Bagus");


    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("hello " + firstName + lastName);
    }

}

