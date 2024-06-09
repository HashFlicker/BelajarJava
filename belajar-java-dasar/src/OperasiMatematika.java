public class OperasiMatematika {
    public static void main(String[] args) {

        /*
            Operator Matematika
            Operator            Fungsi
            +                   Pertambahan
            -                   Pengurangan
            *                   Perkalian
            /                   Pembagian
            %                   Modulus (Sisa Bagi)
         */
        int a = 100;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // Augmented Assignment (operasi ke variable sendiri)
        /*
            Operasi Matematika              Augmented Assignment
            a = a + 10                      a += 10
            a = a - 10                      a -= 10
            a = a * 10                      a *= 10
            a = a / 10                      a /= 10
            a = a % 10                      a %= 10
         */
        int c = 100;
        c += 10;
        System.out.println("\n" + c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        //Unary Operator
        /*
            Operator            Keterangan
            ++                  a = a + 1
            --                  a = a - 1
            -                   Negative
            +                   Positive
            !                   Boolean Kebalikan
         */
        int d = 100;
        int e = -100;

        System.out.println("\n" + e);

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!false);









    }
}
