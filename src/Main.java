public class Main
{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

        task7();
        task8();
    }

    public static void task1 () {
        System.out.println(" ");
        System.out.println("Задача 1");
        // С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально
        // мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        int vklad = 15000;
        int totalVklad = vklad;
        int a = 1;
        while (totalVklad <= 2459000) {
            System.out.println(a + "-й месяц, сумма вклада = " + totalVklad + " руб.");
            a++;
            totalVklad = totalVklad + vklad;
        }
        System.out.println(a + "-й месяц, сумма вклада = " + totalVklad + " руб.");
    }


    public static void task2 () {
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

        for (; i>=1; i = i-1) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");

    }


    public static void task3 () {
        System.out.println(" ");
        System.out.println("Задача 3");
        //В стране Y население равно 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.

        int people = 12000000;
        int born = 17 * 1000;
        int death = 8 * 1000;

        for (int i = 1; i < 10; i++) {
            people = people + born - death;
            System.out.println(i + "-й год, численность = " + people + " человек.");
        }

    }


    public static void task4 () {
        System.out.println(" ");
        System.out.println("Задача 4-5-6");
        // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка
        // от накоплений не меняется, а всегда равен 7%.
        double vklad = 15000;
        int i = 0;
        while (vklad < 12000000) {
            i++;
            vklad = vklad + vklad * 0.07;
            if (i % 6 ==0 && i <= 12*9) {
                System.out.println(i + "-й месяц, вклад Василия = " + vklad + " руб.");
            }

        }

        // Видоизмените программу таким образом, чтобы в консоль выводились не все
        // месяцы подряд, а только каждый шестой. Должны быть видны накопления
        // за 6, 12, 18, 24-й и следующие месяцы.


        // Напишите программу, которая будет выводить сумму накоплений за каждые
        // полгода в течение 9 лет.

    }


    public static void task7 () {
        System.out.println(" ");
        System.out.println("Задача 7");
        // Выведите на каждую пятницу месяца (включая полученную) с
        // ообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет»
        int today = 0;
        int pt = 0;
        while (today < 31) {
            pt = pt+1;
            if ((pt-5) %7 ==0 && pt >0 && pt <31) {
                System.out.println(pt + " число - сегодня пятница, нужно подготовить отчет.");
            }
            today++;
        }

    }

    public static void task8 () {
        System.out.println(" ");
        System.out.println("Задача 8");
        // Нам нужно написать астрономическое приложение, которое считает,
        // когда над Землей пролетает комета.
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        int today = 2023;
                int i = 0;
        while (i <= today+100 ) {
            if (i >= today-200){
            System.out.println(i);
            }
            i = i+ 79;

        }
    }




}