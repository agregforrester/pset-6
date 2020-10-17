import java.util.Scanner;

        public class Exercise4 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer;
                int sum = 0;
                int counter = 0;

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                    if (integer < 0) {
                        break;
                    } else {
                        sum = sum + integer;
                        counter++;
                    }

                } while (true);

                double sum1 = sum;

                if (counter == 0) {
                    System.out.println(" ");
                    System.out.print("Error: division by zero.");
                } else {
                    double average = sum1 / counter;

                    System.out.println(" ");
                    System.out.printf("%,.2f", average);
                }
                in.close();
            }
        }