public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);


    public static void main(String[] args) {

     viewShowTodoList();

    }

    /**
     * menampilkan todo list
     */

    public static void showTodoList(){
        System.out.println("TODO LIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    // test show
    /*public static void testShowTodoList(){
        //model[0] = "belajar java";
        //model[1] = "belajar membuat todo list";
        showTodoList();
    }*/


    /**
     * Menambahkan todo list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                // model masih kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, kita resize array ke 2 kali lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /*//test add todolist
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("contoh ke " + i);
        }
    }*/

    /**
     *  Menghapus todo list
     */
    public static boolean removeTodoList(int number){
        if((number - 1) >= model.length){
            return false;
        } else if(model[number - 1] == null){
            return false;
        } else{
            model[number - 1] = null;

            for (int i = (number - 1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i] = null;
                } else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    // test remove todo list
    /*public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");


        var result = removeTodoList(25);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

    }*/

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /*public static void testinput(){
        var name = input("Nama");
        System.out.println("hi " + name);

        var channel = input("channel");
        System.out.println(channel);
    }*/

    /**
     *  view menampilkan view show todo list
     */
    public static void viewShowTodoList(){
       while(true) {
           showTodoList();

           System.out.println("=====MENU=====");
           System.out.println("1. Tambah");
           System.out.println("2. Hapus");
           System.out.println("x. Keluar");

           var input = input("pilih");
           if (input.equals("1")) {
               viewAddTodoList();
           } else if (input.equals("2")) {
               viewRemoveTodoList();
           } else if(input.equals("x")){
               break;
           }else{
               System.out.println("pilihan tidak dimengerti");
           }
       }
    }

    /*
    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        addTodoList("Enam");

        viewShowTodoList();

    }*/

    /**
     *  View menampilkan Menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("todo (x jika batal)");
        if(todo.equals("x")){
            // batal
        }else{
            addTodoList(todo);
        }
    }

    /*public static void testViewAddTodoList(){
        addTodoList("satu");
        addTodoList("dua");

        viewAddTodoList();

        showTodoList();
    }*/

    /**
     *  view menampilkan menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("MENGHAPUS TODO LIST");
        showTodoList();
        var number = input("nomor yang dihapus (x jika batal)");
        if(number.equals("x")){
            //batal
        } else{
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("gagal menghapus list ke-" + number);
            }
        }
    }

    /*
    public static void testViewRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }*/

}
