public class ForEach {
    public static void main(String[] args) {

        // For Each berfungsi untuk mengambil seluruh data array secara otomatis untuk perulangan

        // perulangan array tanpa for each
        String[] names = {
                "Brata", "bagus", "Kharismawan",
                "Mang", "Bret", "boi",
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }


        //Dengan For Each
        System.out.println("\nFor Each");

        for(var name:names){
            System.out.println(name);
        }


        // dengan for each



    }
}
