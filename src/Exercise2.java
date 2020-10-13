import java.util.Scanner;

        public class Exercise2 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int integer = 0;
                String[] digits = new String[20];
                String str = "";

                do {
                    System.out.print("Enter an integer: ");
                    integer = in.nextInt();
                    in.nextLine();

                } while (integer <= 0);

                String integer1 = Integer.toString(integer);

                for (int x = 0; x < integer1.length(); x++) {
                    str = integer1.substring(x, x + 1);
                    digits[integer1.length() - x] = str;
                    str = "";
                }

                System.out.println(" ");
                for (int y = 1; y < integer1.length() + 1; y++) {
                    if (y == integer1.length()) {
                        System.out.print(digits[y] + ".");
                        break;
                    }

                    System.out.print(digits[y] + ", ");
                }
                in.close();
            }
        }