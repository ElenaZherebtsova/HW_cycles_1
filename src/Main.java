public class Main
{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        // С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int a = 1; a <= 10; a++) {
            System.out.printf(" " + a);
        }
        System.out.println(" ");

    }


    public static void task2 () {
        System.out.println(" ");
        System.out.println("Задача 2");
        // С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int b = 10; b >= 1; b = b-1) {
            System.out.printf(" " + b);
        }
        System.out.println(" ");

    }


    public static void task3 () {
        System.out.println(" ");
        System.out.println("Задача 3");
        // Выведите в консоль все четные числа от 0 до 17.
        for (int c = 0; c <= 17; c = c+2) {
            System.out.printf(" " + c);
        }
        System.out.println(" ");

    }


    public static void task4 () {
        System.out.println(" ");
        System.out.println("Задача 4");
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int d = 10; d >= -10; d = d -1) {
            System.out.printf(d + " ");
        }
        System.out.println(" ");
    }

    public static void task5 () {
        System.out.println(" ");
        System.out.println("Задача 5");
        // Напишите программу, которая выводит в консоль все високосные года,
        // начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате:
        // «… год является високосным».
        for (int e = 1904; e <= 2096; e = e+4) {
            System.out.println(e +"-й год является високосным.");
        }

    }


    public static void task6 () {
        System.out.println(" ");
        System.out.println("Задача 6");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int f = 7; f <= 98; f = f+7) {
            System.out.printf(f +" ");
        }
        System.out.println(" ");

    }


    public static void task7 () {
        System.out.println(" ");
        System.out.println("Задача 7");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        for (int g = 1; g <= 512; g = g*2) {
            System.out.printf(g + " ");
        }
        System.out.println(" ");

    }

    public static void task8 () {
        System.out.println(" ");
        System.out.println("Задача 8");
        // Посчитайте с помощью цикла for сумму годовых накоплений,
        // если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        int vklad = 29000;
        int totalVklad = 0;
        for (int i =0; i <= 12; i++) {
            System.out.println(i +"-й месяц, сумма накоплений = " + totalVklad + " руб.");
            totalVklad = totalVklad + vklad;
        }

    }


    public static void task9 () {
        System.out.println(" ");
        System.out.println("Задача 9");
        // Перепишите решение задачи выше при условии,
        // что деньги вы откладывать будете не «в банку»,
        // а в банк под проценты — 12% годовых.
        int vkladBank = 29000;
        int totalVkladBank = 0;

        int vkladBankProcent = vkladBank * 100;
        int totalProcent = 0;
        for (int i = 1; i <= 12; i++) {
            totalProcent = totalProcent + totalProcent / 100;
            totalProcent = totalProcent + vkladBankProcent;

            totalVkladBank = totalProcent / 100;
            System.out.println(i +"-й месяй, сумма накоплений = "
                    + totalVkladBank + " руб.");
        }


        System.out.println(" ");

    }

    public static void task10 () {
        System.out.println("Задача 10");
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:
        // 2*1=2...

        for (int j=1; j <= 10; j++) {
            System.out.println(j + "*2=" + j*2);
        }

        System.out.println(" ");

    }







}