public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "F";

        // Switch Case
        switch (nilai){
            case "A":
                System.out.println("Mantap Bro Lu Lulus!!!");
                break;
            case "B":
            case "C":
                System.out.println("Mayan Broo");
                break;
            case "D":
                System.out.println("yailah bro gitu doang");
            default:
                System.out.println("GUOOOBLOOOKK");
        };

        System.out.println("\n=======\n");


        // Switch Lambda
        // cuma bisa jalan di java versi 14++
        nilai = "B";

        switch (nilai) {
            case "A" -> System.out.println("Mantap Bro Lu Lulus!!!");
            case "B","C" -> System.out.println("Mayan Broo");
            case "D" -> System.out.println("yailah bro gitu doang");
            default -> System.out.println("GUOOOOBLOOKK");

        };

        System.out.println("\n=======\n");

        // Switch Yield
        // cuma bisa jalan di java versi 14++
        nilai = "A";
        var ucapan = switch(nilai){
            case "A" : yield "Mantap Bro Lu Lulus!!!";
            case "B","C" : yield "Mayan Broo";
            case "D" : yield "yailah bro gitu doang";
            default : yield "GUOOOOOBLOOOKKK";
        };

        System.out.println(ucapan);




    }
}
