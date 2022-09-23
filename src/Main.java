

public class Main {
    public static void main(String[] args) {
        //Task #1.1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total +=salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Task #1.2
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        //Task #1.3
        int population = 12_000_000;
        int birthAmount = 17;
        int dieAmount = -8;
        for (i = 0; i <= 10; i++) {
            population += (birthAmount + dieAmount) * population / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        //Task #2.1
        int percentPerMonth = 7;
        int saving = 15_000;
        int month = 0;
        while (saving < 12_000_000) {
            saving += saving * percentPerMonth / 100;
            month +=1;
            System.out.println("Месяц " + month + " накопления будут " + saving);
        }
        System.out.println("Всего месяцев ждать " + month);

        //Task #2.2
        percentPerMonth = 7;
        saving = 15_000;
        month = 0;
        while (saving < 12_000_000) {
            saving += saving * percentPerMonth / 100;
            month +=1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накопления будут " + saving);
            }
        }
        System.out.println("Всего месяцев ждать " + month);

        //Task #2.3
        int monthsPlaning = 9 * 12;
        month = 0;
        saving = 15000;
        while (month < monthsPlaning) {
            saving += saving * percentPerMonth / 100;
            month +=1;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений за " + month + " месяцев составляет " + saving + " рублей");
            }
        }

        // Task #2.4


        int daysInWeek = 7;
        int daysInMonth = 31;
        for (int fridayDate = 4; fridayDate <= daysInMonth; fridayDate += daysInWeek) {
            System.out.println("Сегодня пятница, " + fridayDate +"-е число. Необходимо подготовить отчет.");
        }

        // Task 3.1
        int currentYear = 2022;
        for (int year = currentYear - 200; year <= currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        //Task 3.2
        int num = 2;
        for (int k = 1; k <= 10; k++) {
            System.out.println(num + "*" + k +"=" + num*k);
        }

        // Task #3.3



    }
}