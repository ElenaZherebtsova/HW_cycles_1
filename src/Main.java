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
        int limit = 2_459_000;
        while (totalVklad < limit) {
            totalVklad = totalVklad + vklad;
            month++;
            System.out.println(month + "-й месяц, сумма вклада = " + totalVklad + " руб.");

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
        int born = 17;
        int death = 8;

        for (int i = 1; i <= 10; i++) {
            int bornYear = people / 1000 * born;
            int deathYear = people / 1000 * death;

            people  = people + bornYear - deathYear;
            System.out.println(i + "-й год, численность = " + people + " человек.");
        }

    }


    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача 4");
        // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка
        // от накоплений не меняется, а всегда равен 7%.
        double vklad4 = 15_000;
        int i = 1;
        int limitVklad = 12_000_000;
        int percent = 7;
        while (vklad4 < limitVklad) {
            i++;
            vklad4 = vklad4 + vklad4 * percent / 100;
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
        int limitVklad5 = 12_000_000;
        int percent5 = 7;
        while (vklad5 < limitVklad5) {
            i++;
            vklad5 += vklad5 * percent5 / 100;
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
        double vklad6 = 15_000;
        int percent6 = 7;
        int limitYear = 9;
        int i = 0;
        while (i <= limitYear * 12) {
            i++;
            vklad6 += vklad6 * percent6 /100;
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

