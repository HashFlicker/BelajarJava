
// ini class
// Dituliskan dengan huruf besar di depan tiap kata
class Person {

    /**
      - field/properties/attributes, data yang bisa disisipkan dalam object
      - sebelum memasukkan data, kita harus mendeklarasikan data yang dimiliki object
    tersebut dalam deklarasi classnya
      - Membuat field sama dengan membuat variable tapi ditempatkan di block class
    */

    // ini field
    String name;
    String address;
    final String country = "Indonesia"; // data harus dideklarasikan karena tipe variabel final

    /**
      - Method dideklarasikan di dalam block class
      - kita juga bisa menambahkan return value, parameter & overloading di dalam block class
      - untuk mengakses method, kita menggunakan titik (.) dan diikuti nama methodnya
    */
    void sayHello(String paramName){
        System.out.println("hello " + paramName + ", My Name is " + name);
    }





}
