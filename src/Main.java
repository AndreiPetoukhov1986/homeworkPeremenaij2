public class Main {
    public static void main(String[] args) {
        byte a = 58;
        int b = 500;
        float c = 1.5f;

        System.out.println("Значение переменной a с типом byte равно  " + a);
        System.out.println("Значение переменной b с типом int равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);

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

        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int totalClass = class1+class2+class3;
        int e = 480/totalClass;
        System.out.println("На каждого ученика рассчитано " + e + " листов бумаги");




    }
}