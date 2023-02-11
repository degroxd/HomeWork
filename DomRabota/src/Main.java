import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        System.out.println("\t\t\tДобро пожаловать в калькулятор температур");

        // Формула F = C * 1.8 + 32

        System.out.println("Введите температуру по Цельсию");
        double a = new Scanner(System.in).nextDouble();

        int coof = 32;
        double coof2 = 1.8;

        System.out.println("Температура по Цельсию: " + a);
        System.out.println("Температура по фаренгейту: " + (a * coof2 + coof));
    }
}

class KonverterDomZadanie {
    public static void main(String[] args) {
        System.out.println("\t\t\tДобро пожаловать в конвертер валют");

        // Формула Д/Э = Р / К,
        // где. Д/Э - количество долларов/евро
        // Р - количество рублей
        // К - курс доллара.
        // Курс $ на сегодняшний день - 71,58;
        // Курс евро на сегодняшний день - 76,83;

        System.out.println("Введите сумму в рублях");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите текущий курс доллора");
        double $ = new Scanner(System.in).nextDouble();

        System.out.println("Введите текущий курс евро");
        double evro = new Scanner(System.in).nextDouble();

        System.out.println("Курс $: " + a*(1/$));
        System.out.println("Курс евро: " + a*(1/evro));
    }
}

