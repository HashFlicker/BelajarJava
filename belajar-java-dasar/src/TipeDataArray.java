public class TipeDataArray {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Brata";
        stringArray[1] = "Bagus";
        stringArray[2] = "Kharismawan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Bret";
        System.out.println(" \n" + stringArray[0]);

        String[] stringArray2 = new String[3];


        // Array Initializer
        int[] arrayInt = new int[]{
                10, 20, 60, 15, 46
        };

        long[] arrayLong = {
                1L, 6L, 237L, 26L, 632L
        };

        System.out.println("\n" + arrayInt[2]);
        System.out.println(arrayLong[4]);

        // mengubah nilai array
        // array tidak bisa dihapus, kita hanya bisa mengubahnya menjadi data kosong
        arrayLong[4] = 23L;
        System.out.println("\n" + arrayLong[4]);


        // panjang array
        System.out.println("\npanjang aray : " + arrayLong.length);


        // Array di dalam array
        String[][] members = {
                {"Brata", "Bagus"},
                {"Bret", "Boi"},
        };

        System.out.println("\n" + members[0][1]);
        System.out.println(members[1]); //output akan menjadi bahasa mesin

        members[0][1] = "Bagas";
        System.out.println("\n" + members[0][1]);



    }
}
