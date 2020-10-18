import java.util.Scanner;

        public class Exercise10 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter credit card number: ");
                String creditCard = in.nextLine();
                StringBuilder products = new StringBuilder();
                int product;
                int sum = 0;

                for (int i = creditCard.length() - 2; i >= 0; i -= 2) {
                    product = Character.getNumericValue(creditCard.charAt(i)) * 2;
                    products.append(product);
                }

                for (int j = 0; j < products.length(); j++) {
                    sum += Character.getNumericValue(products.charAt(j));
                }

                if (creditCard.length() % 2 == 0) {
                    for (int k = 1; k < creditCard.length(); k += 2) {
                        sum += Character.getNumericValue(creditCard.charAt(k));
                    }
                } else {
                    for (int k = 0; k < creditCard.length(); k += 2) {
                        sum += Character.getNumericValue(creditCard.charAt(k));
                    }
                }
                if ( sum % 10 == 0) {

                        if ((creditCard.length() == 13 || creditCard.length() == 16) && creditCard.startsWith("4")) {
                            System.out.println(" ");
                            System.out.print("Visa.");
                        } else if (creditCard.length() == 15 && (creditCard.startsWith("34") || creditCard.startsWith("37"))) {
                            System.out.println(" ");
                            System.out.print("American Express.");
                        } else if (creditCard.length() == 16 && (creditCard.startsWith("51") || creditCard.startsWith("52") || creditCard.startsWith("53") || creditCard.startsWith("54") || creditCard.startsWith("55"))) {
                            System.out.println(" ");
                            System.out.print("Mastercard.");
                        } else {
                            System.out.println(" ");
                            System.out.print("Invalid.");
                        }
                } else {
                    System.out.println(" ");
                    System.out.print("Invalid.");
                }
                in.close();
            }
        }