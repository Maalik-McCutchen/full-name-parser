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
            firstName = fullName.substring(0, nameSpaceOne);
            middleName = ("None");
            lastName = fullName.substring(nameSpaceTwo + 1);


        } else {
            firstName = fullName.substring(0, nameSpaceOne);
            middleName = fullName.substring(nameSpaceOne + 1);
            lastName = fullName.substring(nameSpaceTwo + 1);

            System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
        }
    }
}
