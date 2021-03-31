import java.util.Scanner;

public class ScannerInput {

    public static int readNextInt(String prompt) {
        do {
          Scanner scanner = new Scanner(System.in);
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    public static int readNextInt() {
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                return Integer.parseInt(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    public static double readNextDouble(String prompt) {
        do {
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print(prompt);
                return Double.parseDouble(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }

    public static double readNextDouble() {
        do {
            Scanner scanner = new Scanner(System.in);
            try{
                return Double.parseDouble(scanner.next());
            }
            catch (NumberFormatException e) {
                System.err.println("\tEnter a number please.");
            }
        }  while (true);
    }


    public static String readNextLine(String prompt) {
        Scanner scanner = new Scanner(System.in);
                System.out.print(prompt);
                return scanner.nextLine();
    }

    public static String readNextLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
