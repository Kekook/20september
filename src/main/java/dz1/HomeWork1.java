package dz1;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println(sum(4, 5, 3, 5));
        System.out.println(between10to20(26, 27));
        System.out.println(isNegativeOrPositive(2));
        System.out.println(isNegative(-5));
        String stringV = " Nina";
        greed("Nina");
        leapYear(1934);

        byte byt = (byte) 3;
        short shor = (short) 10;
        int i = 15;
        long lon = 300L;
        float flo = 17.23f;
        double dou = 27.1919191;
        char cha = 'A';
        boolean bol = false;


    }

    //    float a = 10.3f;
//    float b = 20.4f;
//    float c = 5.6f;
//    float d = 12.4f;
    public static float sum(float a, float b, float c, float d) {
        return a * (b + (c / d));


    }

    public static boolean between10to20(int x, int y) {
        if (x + y >= 10 && x + y <= 20) return true;
        else return false;
    }

    public static boolean isNegativeOrPositive(int j) {
        if (j >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }
        return false;
    }

    public static boolean isNegative(int n) {
        if (n < 0) return true;
        else return false;
    }

    public static void greed(String name) {
        System.out.println("Привет, " + name + "!!!");

    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");


        }
    }
}