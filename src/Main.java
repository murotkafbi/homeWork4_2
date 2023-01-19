public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int save = 245900;
        int total = 0;
        int postpone = 15000;

        int month;
        for(month = 1; total < save; ++month) {
            total += postpone;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2 ");
        int one = 1;

        for(int ten = 10; one <= ten; ++one) {
            System.out.println("" + one + " ");
        }

        System.out.println();

        for(one = 10; one >= 1; --one) {
            System.out.println("" + one + " ");
            System.out.println();
        }

        System.out.println("Задание 3");
        int population = 12000000;
        int coeff = 1000;
        int fertility = 17;
        int mortality = 8;
        int difference = fertility - mortality;
        int years = 10;

        int wanted;
        for(wanted = 1; wanted <= years; ++wanted) {
            population += population * difference / coeff;
            System.out.println("Год " + wanted + " , численость насления состовляет " + population);
            ++month;
        }

        System.out.println("Задание 4 ");
        wanted = 12000000;
        int totalA = 15000;
        int OneMonth = 1;

        double percent;
        for(percent = 0.0; total < wanted; ++OneMonth) {
            totalA += (int)((double)totalA * percent);
            System.out.println("Месяц " + OneMonth + " , сумма накоплений равна " + totalA + " рублей");
        }

        System.out.println("Задание 5 ");
        int wanted1 = 12000000;
        int totalA1 = 15000;
        int OneMonth1 = 1;
        double percent1 = 0.0;

        while(totalA1 < wanted1) {
            totalA += (int)((double)totalA * percent);
            if (OneMonth1 % 6 == 0) {
                System.out.println("Месяц " + OneMonth1 + " , сумма накоплений равна " + totalA1 + " рублей");
                ++OneMonth1;
            }
        }

    }

    public static void task6() {
        int months = 108;
        int total = 15000;
        double percent = 0.07;

        for(int month = 1; month <= months; ++month) {
            total += (int)((double)total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println("Задание 7");
        int firstFriday = 6;

        for(int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-e число. Необходимо подготовить отчет");
        }

    }
    }