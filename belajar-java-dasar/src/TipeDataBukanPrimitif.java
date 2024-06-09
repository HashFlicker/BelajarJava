import org.w3c.dom.ls.LSOutput;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /*
        Tipe data bukan primitif tidak memiliki default value dan bisa bernilai null
        dan bisa memiliki method/function
         */

        /*
            Representasi Tipe Data Primitif (1)
            -----------------------------------
            Primitif            Bukan Primitif
            byte                Byte
            short               Short
            int                 Integer
            long                Long
            float               Float
            double              Double
            -----------------------------------
            Primitif            Bukan Primitif
            char                Character
            boolean             Boolean
            -----------------------------------
         */

        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte; // defaultnya null
        iniByte = null; // kalau mau print data null nya

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // konversi primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float inifloat = iniObject.floatValue();

        System.out.println(inifloat);




    }
}
