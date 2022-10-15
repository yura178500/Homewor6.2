public class Main {
    public static void main(String[] args) {
        //Задача 1
        int salary = 15000;
        int total = 0;
        for (int i = 0; total < 12000000; i++) {
            total = (int) (total + total * 0.7);
            total = total + salary;
            System.out.print("Месяц" + i + "Доход" + total);
        }

        // Задача 2
        int salary = 15000;
        int total = 0;
        for (int i = 0; total < 12000000; i++) {
            total = (int) (total + total * 0.7);
            total = total + salary;
            if(i % 6 == 0) { System.out.print("Месяц" + i + "Доход" + total); }


        // Задача 3
        int salary = 15000;
        int total = 0;
        while (total < 12000000) {
            for (int i = 0; i <= 9; i++) {
                i = i / 2;
                total = (int) (total + total * 0.7);
                total = total + salary;
                System.out.print("Месяц" + i + "Доход" + total);
            }

            //Задача 4
            int monthNumber = 1;
            int friday = monthNumber + 7;
            while (monthNumber < 31) {
                System.out.print("Сегодня" + friday + "пятница, необходимо подготовить отчет.");
            }
        }
    }}