package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
//    Scanner scanner = new Scanner(System.in);
    private Scanner scanner;
    private Order currentOrder;

    // constructor:
    //--left blank in the notes, no constructor for now


    public UserInterface(Scanner scanner) {
//        this.scanner = scanner;
        scanner = new Scanner(System.in);
    }

    //int because user will input a number for option selection
    public int showHomeScreen() {
        System.out.println("""
                =^>.<^=  |   =^>.<^=  |   =^>.<^=
                Welcome to Ipsy, Jake, & Hyde's Deli
                -_-_-_-_-_-_-_-_-_-_-_-_-_-
                Please Make A Selection:
                1] New Order
                0] Exit""");
        return  scanner.nextInt();

    }

    public int showOrderMenu() {
        System.out.println("""
                PLease Make A Selection:
                1] Add A Sandwich
                2] Add A Drink
                3] Add Chips
                4] Checkout
                0] Cancel Order (Please don't, we'll be sad if you do!""");
        return scanner.nextInt();
    }

    //string because user will type out their bread choice
    //try to make cat related pun
    public String showBreadTypes() {
        System.out.println("""
                We knead bread instead of biscuits (mm) (mm)
                We have: Wheat, White, Rye, and Wraps
                What would you like?""");
        return scanner.next().toLowerCase();

    }

    public int showAvailableSize() {
        System.out.println("""
                Purrr-portion control? Never met her.
                Which size would you like
                4] 4 inches
                8] 8 inches
                12] 12 inches""");
        return scanner.nextInt();
    }

    //consider using an else/if statement here...
    public boolean showToastingOptions() {
        System.out.println("""
                We, too, sometimes come out toasted
                Would you like your Sandwich/wrap toasted?
                yes or no""");
        String input = scanner.next().toLowerCase();

        if (input.equals("yes")) {
            return true;
        }else if (input.equals("no")) {
            return false;
        } else {
            System.out.println("Please enter either 'yes' or 'no' ");
        }
        return false;
    }






}
//public class UserInterface {
    // declare a Scanner object for reading input from the console

    // constructor:

    // showHomeScreen:
    //   - print app title and welcome message
    //   - print:
    //       1) New Order
    //       0) Exit
    //   - prompt user for choice
    //   - return user input

    // showOrderMenu:
    //   - print:
    //       1) Add Sandwich
    //       2) Add Drink
    //       3) Add Chips
    //       4) Checkout
    //       0) Cancel Order
    //   - prompt user for choice
    //   - return user input

    // promptForBreadType:
    //   - print list of bread types
    //   - ask user to type one in (e.g., "white")
    //   - return as user input

    // promptForSize:
    //   - ask user: "What size? (4, 8, or 12 inches)"
    //   - return user input

    // promptForToasted:
    //   - ask: "Would you like it toasted? (yes or no)"
    //   - return user input

    // promptForMeats:
    //   - possible loop (one or multiple meats?):
    //       - ask user to type of meat (or 'done' to finish)
    //       - ask if they want Extra meat? (yes or no)"
    //   - return list of meats and extras

    // and so on and so on........

//}

//refer to chart in capstone notes for list of items
//use cat puns
//cat face and paws format: =^>.<^= and (mm) (mm)