public class OperasiBoolean {
    public static void main(String[] args) {
        /*
            Operator            Keterangan
            &&                  Dan (and)
            ||                  atau (or)
            !                   tidak (not)
         */

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println("hasil kelulusan : " + lulus);


        var asalLulus = lulusAbsen || lulusNilai;
        System.out.println("hasil asal lulus : " + asalLulus);
    }
}
