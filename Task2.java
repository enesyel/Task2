import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRounds;
        do {
            System.out.print("Enter number of rounds (1-99): ");
            numberOfRounds = input.nextInt();
        } while (numberOfRounds < 1 || numberOfRounds > 99);

        System.out.println("+---------+---------+---------+---------+---------+---------+---------+");
        System.out.println("|  ROUND  |  DICE1  |  DICE2  |  DICE3  | TOTAL1  |  TOTAL2 |  TOTAL3 |");

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 1; i <= numberOfRounds; i++) {

            int dice1 = (int) (1 + Math.random() * 6);
            int dice2 = (int) (1 + Math.random() * 6);
            int dice3 = (int) (1 + Math.random() * 6);

            if (dice1 == dice2 & dice1 > dice3) {
                total1 += dice1 * 2;
                total2 += dice2 * 2;
                total3 += dice3;
            } else if (dice2 == dice3 & dice2 > dice1) {
                total2 += dice2 * 2;
                total3 += dice3 * 2;
                total1 += dice1;
            } else if (dice1 == dice3 & dice1 > dice2) {
                total1 += dice1 * 2;
                total3 += dice2;
                total2 += dice2;
            } else {
                total1 += dice1;
                total2 += dice2;
                total3 += dice3;
            }
            System.out.println("+---------+---------+---------+---------+---------+---------+---------+");
            System.out.print("|    " + i + "    |    " + dice1 + "    |    " + dice2 + "    |    " + dice3 + "    |    ");
            if (total1 >= 10 & total2 >= 10 & total3 >= 10) {
                System.out.println(total1 + "   |    " + total2 + "   |    " + total3 + "   |");
            } else if (total1 >= 10 & total2 >= 10 & total3 < 10) {
                System.out.println(total1 + "   |    " + total2 + "   |    " + total3 + "    |");
            } else if (total1 >= 10 & total2 < 10 & total3 >= 10) {
                System.out.println(total1 + "   |    " + total2 + "    |    " + total3 + "   |");
            } else if (total1 < 10 & total2 >= 10 & total3 >= 10) {
                System.out.println(total1 + "    |    " + total2 + "   |    " + total3 + "   |");
            } else if (total1 < 10 & total2 < 10 & total3 >= 10) {
                System.out.println(total1 + "    |    " + total2 + "    |    " + total3 + "   |");
            } else if (total1 < 10 & total2 >= 10 & total3 < 10) {
                System.out.println(total1 + "    |    " + total2 + "   |    " + total3 + "    |");
            } else if (total1 >= 10 & total2 < 10 & total3 < 10) {
                System.out.println(total1 + "   |    " + total2 + "    |    " + total3 + "    |");
            } else {
                System.out.println(total1 + "    |    " + total2 + "    |    " + total3 + "    |");
            }
        }
        System.out.println("+---------+---------+---------+---------+---------+---------+---------+");
    }
}



