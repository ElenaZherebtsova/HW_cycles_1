public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" ");
        System.out.println("Задача 1");
        // С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально
        // мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        int vklad = 15000;
        int totalVklad = 0;
        int month = 0;
        while (totalVklad < 2_459_000) {
            month++;
            System.out.println(month + "-й месяц, сумма вклада = " + totalVklad + " руб.");

            totalVklad = totalVklad + vklad;
        }
        System.out.println(month + "-й месяц, сумма вклада = " + totalVklad + " руб.");
    }


    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача 2");
        // Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        // На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf(i + " ");
        }
        System.out.println(" ");

        for (; i >= 1; i = i - 1) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");

    }


    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача 3");
        //В стране Y население равно 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.

        int people = 12_000_000;

        for (int i = 1; i <= 10; i++) {
            int born = people / 1000 * 17;
            int death = people / 1000 * 8;

            people  = people + born - death;
            System.out.println(i + "-й год, численность = " + people + " человек.");
        }

    }


    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача 4");
        // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка
        // от накоплений не меняется, а всегда равен 7%.
        double vklad4 = 15000;
        int i = 1;
        while (vklad4 < 12000000) {
            i++;
            vklad4 = vklad4 + vklad4 * 0.07;
            System.out.println(i + "-й месяц, вклад Василия = " + vklad4 + " руб.");
        }

    }

    public static void task5() {
        System.out.println(" ");
        System.out.println("Задача 5");
        // Видоизмените программу таким образом, чтобы в консоль выводились не все
        // месяцы подряд, а только каждый шестой. Должны быть видны накопления
        // за 6, 12, 18, 24-й и следующие месяцы.
        double vklad5 = 15000;
        int i = 0;
        while (vklad5 < 12000000) {
            i++;
            vklad5 += vklad5 * 0.07;
            if (i % 6 == 0) {
                System.out.println(i + "-й месяц, вклад Василия = " + vklad5 + " руб.");
            }
        }
    }


    public static void task6() {
        System.out.println(" ");
        System.out.println("Задача 6");
        // Напишите программу, которая будет выводить сумму накоплений за каждые
        // полгода в течение 9 лет.
        double vklad6 = 15000;
        int i = 0;
        while (i <= 9 * 12) {
            i++;
            vklad6 += vklad6 * 0.07;
            if (i % 6 == 0) {
                System.out.println(i + "-й месяц, вклад Василия = " + vklad6 + " руб.");
            }

        }

    }


    public static void task7() {
        System.out.println(" ");
        System.out.println("Задача 7");
        // Выведите на каждую пятницу месяца (включая полученную) с
        // ообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет»

        int pt = 3;
        int monthDays = 31;

        for (; pt <= monthDays; pt += 7) {
            System.out.println(pt + "-е число это пятница, нужно подготовить отчет!");
        }


    }

    public static void task8() {
        System.out.println(" ");
        System.out.println("Задача 8");
        // Нам нужно написать астрономическое приложение, которое считает,
        // когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        int today = 2023;
        for (int i = 0; i < today + 100; i = i + 79) {
            if (i >= today - 200) {
                System.out.println(i);
            }

        }

    }
}

