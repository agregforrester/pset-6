import java.util.Scanner;

        public class Exercise6 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer = 0;

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                } while (integer < 0 || integer > 92);

                if (integer == 1) {
                    System.out.println(" ");
                    System.out.print(0);
                } else if (integer == 2) {
                    System.out.println(" ");
                    System.out.print(1);
                } else {
                    double x = (Math.pow(1.618034, integer - 1) - (Math.pow(-0.618034, integer - 1))) / Math.sqrt(5);

                    System.out.println(" ");
                    System.out.printf("%,.0f", x);System.out.print(".");
                }

                in.close();
            }
        }