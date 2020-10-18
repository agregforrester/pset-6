import java.util.Scanner;

        public class Exercise8 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int height = 0;
                String space = "##";

                do {
                    System.out.print("Height: ");
                    height = in.nextInt();
                } while (height < 1 || height > 24);

                System.out.println(" ");

                int height2 = height;

                while (height2 > 1) {
                    space = " " + space;
                    height2--;
                }

                System.out.println(space);

                while (height > 1) {
                    String space1 = space.replace(" #", "##");
                    System.out.println(space1);
                    height--;
                    space = space1;
                }
                System.out.println(" ");
                in.close();
            }
        }