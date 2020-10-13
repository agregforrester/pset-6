import java.util.Scanner;

        public class Exercise1 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int upper;
                int sum = 0;

                System.out.print("Lower bound: ");
                int lower = in.nextInt();
                in.nextLine();

                do {
                    System.out.print("Upper bound: ");
                    upper = in.nextInt();
                    in.nextLine();

                    if (upper >= lower) {
                        break;
                    }

                } while (upper <= lower);

                for (int x = lower; x <= upper; x++) {
                    if (x % 2 == 0) {
                        sum += x;
                    }
                }

                double sum1 = (double) sum;

                System.out.println(" ");
                System.out.printf("%,.0f", sum1); System.out.print(".");
                in.close();
            }
        }