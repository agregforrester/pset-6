import java.util.Scanner;

        public class Exercise9 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int height = 0;
                String space = "##";
                String opposite = "##";

                do {
                    System.out.print("Height: ");
                    height = in.nextInt();
                } while (height < 1 || height > 24);

                System.out.println(" ");

                int height2 = height;
                int height3 = height;

                while (height2 > 1) {
                    space = " " + space;
                    height2--;
                }

                while (height3 > 1) {
                    opposite = opposite + " ";
                    height3--;
                }

                System.out.println(space + "  " + opposite);


                while (height > 1) {
                    String space1 = space.replace(" #", "##");
                    String opposite1 = opposite.replace("# ", "##");

                    System.out.println(space1 + "  " + opposite1);
                    height--;

                    space = space1;
                    opposite = opposite1;
                }
                System.out.println(" ");
                in.close();
            }
        }