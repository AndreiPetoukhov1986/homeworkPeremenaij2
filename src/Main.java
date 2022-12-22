public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        byte a = 58;
        int b = 500;
        float c = 1.5f;

        System.out.println("Значение переменной a с типом byte равно  " + a);
        System.out.println("Значение переменной b с типом int равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);

        System.out.println("задача 2");
        float z = (float)27.12;
        long x = 987678965549L;
        float s = 2.786F;
        short d = 569;
        short f = -159;
        int g = 27897;
        byte k = 67;

        System.out.println(z);
        System.out.println(x);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(k);

        System.out.println("задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalClass = class1+class2+class3;
        int e = 480/totalClass;
        System.out.println("На каждого ученика рассчитано " + e + " листов бумаги");

        System.out.println("задача 4");
        byte numberBottles = 16;
        byte numberBottlesoneminutes = 16/2;
        int numberBottles20minutes = numberBottlesoneminutes*20;
        int numberBottlesday = numberBottlesoneminutes*24*60;
        int numberBottles3day = numberBottlesday*3;
        int numberBottlesmonth = numberBottlesday*30;
        System.out.println("За 20 минут машина произвела " + numberBottles20minutes +  "штук бутылок");
        System.out.println("За сутки машина произвела " + numberBottlesday +  "штук бутылок");
        System.out.println("За 3 дня машина произвела " + numberBottles3day +  "штук бутылок");
        System.out.println("За месяц машина произвела " + numberBottlesmonth +  "штук бутылок");




    }
}