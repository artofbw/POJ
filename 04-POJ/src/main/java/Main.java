import exercise04_05_Armstrong.Armstrong;
import exercise04_06_07.Exercise04_06;
import exercise04_06_07.Exercise04_07;
import exercise04_06_07.filereader.ToReadFile;

import java.util.Scanner;

/**
 * Main class of the application
 * pair programming:
 *
 * @author Rafał Sochacki s20047
 * @author Łukasz Cwikliński s19334
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Armstrong arm = new Armstrong();
    private static ToReadFile fr = new ToReadFile();
    private static Exercise04_07 ex7 = new Exercise04_07();
    private static Exercise04_06 ex6 = new Exercise04_06();

    public static void main(String[] args) {
        menu();
    }

    /**
     * Main menu of the application
     */
    private static void menu() {
        int choice;
        do {
            System.out.println("\n\nWhat do you want to do? " +
                    "\nPress 1 to chceck if number is an Armstrong" +
                    "\nPress 2 to print output for exercise 04_06" +
                    "\nPress 3 to print output for exercise 04_07" +
                    "\nPress 4 to print all words from text i HashTable" +
                    "\nPress 0 to QUIT program");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1: {
                    System.out.print("\nType your number of 3 digits to check: ");

                    int number = scanner.nextInt();

                    System.out.println(arm.isArmstrong(number));
                    break;
                }
                case 2: {
                    ex6.getRandomWords();
                    break;
                }
                case 3: {
                    System.out.println("Duplicates in the file: ");
                    ex7.printDuplicates();
                    break;
                }
                case 4: {
                    fr.readNotesFromUserHome("Sample.txt");
                    fr.printWords();
                }
            }

        } while (choice != 0);
    }
}
