import java.util.Scanner;

        public class Exercise7 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer = 0;
                int x = 1;
                int y = 0;
                String result = "";

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                } while (integer <= 0);

                while (x <= Math.sqrt(integer)) {
                    y = integer % x;

                    if (x == Math.sqrt(integer)) {
                        result = result + x + ". ";
                        break;
                    } else if (y == 0) {
                        result = result + x + ", " + (integer / x) + ", ";
                    }
                    x++;
                }
                System.out.println(" ");
                System.out.print(result);

                in.close();
            }
        }