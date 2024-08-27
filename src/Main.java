import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println("Задача 1");

        int[] salaries = new int[]{80_000, 90_000, 100_000, 110_000, 120_000};
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2

        System.out.println("Задача 2");

        int[] expenses = new int[]{80_000, 40_000, 60_000, 70_000, 50_000};
        int maxExpenses = expenses[0];
        int minExpenses = expenses[0];

        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила "
                + maxExpenses + " рублей");

        // Задача 3

        System.out.println("Задача 3");

        int[] expenses2 = new int[]{50_555, 70_450, 80_333, 40_444, 30_334};
        int sum1 = 0;
        double average = 0;
        for (int i = 0; i < expenses2.length; i++) {
            sum1 += expenses2[i];
            average = (double) sum1 / expenses2.length;
        }
        System.out.println(average);

        // Задача 4

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);


    }
}