import java.util.Scanner;

        public class Exercise3 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer = 0;
                int digit = 0;
                int sum = 0;
                String[] digits = new String[20];
                String str = "";

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                } while (integer <= 0);

                String integer1 = Integer.toString(integer);

                for (int x = 0; x < integer1.length(); x++) {
                    digit = integer % 10;
                    if (digit % 2 == 1) {
                        sum += digit;
                    }

                    integer /= 10;
                    digit = 0;
                }

                double sum1 = sum;

                System.out.println(" ");
                System.out.printf("%,.0f", sum1); System.out.print(".");
                in.close();
            }
        }