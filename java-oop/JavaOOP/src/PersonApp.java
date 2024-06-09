public class PersonApp {
    public static void main(String[] args) {

        //ini membuat object dengan menuliskan new
        var person = new Person();
        var person1 = new Person();
        // membuat ulang object dengan class yg sama
        Person person2 = new Person();


        // menampilkan posisi variable object dalam memori
        // ga penting sih tapi oke hehe :D
        System.out.println(person2);

        /**
                - field pada object bisa dimanipulasi
                - memanipulasi data field sama seperti cara pada variable
                - data field bisa dimanipulasi dengan titik (.)  setelah object dan diikuti nama field
                */
        // deklarasi object
        person.name = "Brata";
        person.address = "ciledug";
        //person.country = "singapur"; // ERROR

        // memanggil method (berhasil)
        person.sayHello("Brata");
        // memanggil method dengan object yang belum dideklarasikan (hasil null)
        var person3 = new Person();
        person3.sayHello("Bret");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);





    }
}
