import java.util.Scanner;

        public class Exercise5 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer;
                int primality = 0;

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                } while (integer <= 1);

                for (int x = 2; x < integer; x++) {
                    if (integer % x == 0) {
                        System.out.println(" ");
                        System.out.print("Not prime.");
                        primality = 1;
                        break;
                    }
                }

                if (primality == 0) {
                    System.out.println(" ");
                    System.out.print("Prime.");
                }
                in.close();
            }
        }