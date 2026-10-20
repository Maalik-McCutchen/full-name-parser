package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String fullName = myScanner.nextLine().trim();

        int nameSpaceOne = fullName.indexOf(" ");

        int nameSpaceTwo = fullName.indexOf(" ", nameSpaceOne + 1);

        String firstName;
        String middleName = "";
        String lastName;

        if (nameSpaceTwo == -1) {
            System.out.println("(None)");


        } else {
            fullName = firstName.substring(0, nameSpaceOne);
            fullName = middleName.substring();

            System.out.println(fullName);
        }
    }
}
