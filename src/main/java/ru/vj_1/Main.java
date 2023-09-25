package ru.vj_1;

public class Main {
    public static void main(String[] args) {


            byte byteM = Byte.MAX_VALUE; // дипозон от -127 до 128
            short shortN = 327; // дипозон от -32768 до 32767
            int intM = Integer.MAX_VALUE; // дипозон -2 147 483 648 до 2 147 483 647
            long longN = 30; // дипозон от  -2^63 до 2^63

            float floatN = 1.5f;
            double doubleN = 2.5;

            boolean booleanA = true; // false
            char charS = '\u0000';
            String str = "Hello";

            System.out.println("Результат переполнения byte: " + (byte) (byteM + 1));;
            System.out.println("Результат переполнения int: " + (intM + 1));

            if (shortN >= 327 && longN ==30){
                    System.out.println("&& обозначает что оба условия должны выполнится");
            }
            if (booleanA == true || doubleN <= 3.3) {
                    System.out.println("|| обозначает что одно из условия должно выполнится");
            }

            System.out.println(shortN + doubleN);




    }
}