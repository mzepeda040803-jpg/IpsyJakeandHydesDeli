package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
//    Scanner scanner = new Scanner(System.in);
    private Scanner scanner;
    private Order currentOrder;

    // constructor:
    //--left blank in the notes, no constructor for now


    public UserInterface() {
        this.scanner = new Scanner(System.in);
//        scanner = new Scanner(System.in);
    }

    //int because user will input a number for option selection
    public int showHomeScreen() {
        System.out.println("""
                =^>.<^=  |   =^>.<^=  |   =^>.<^=
                Welcome to Ipsy, Jake, & Hyde's Deli
                -_-_-_-_-_-_-_-_-_-_-_-_-_-
                
                This Month: For every purchase made,
                we will match it with a donation to
                the local cat rescue in your name because
                every kitty deserves a home.
                
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
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    //string because user will type out their bread choice
    //try to make cat related pun
    public String promptForBreadTypes() {
        System.out.println("""
                We knead bread instead of biscuits (mm) (mm)
                We have: Wheat, White, Rye, and Wraps
                What would you like?""");
        return scanner.next().toLowerCase();

    }

    public int promptForAvailableSize() {
        System.out.println("""
                Purrr-portion control? Never met her.
                Which size would you like
                4] 4 inches $5.50
                8] 8 inches $7.00
                12] 12 inches $8.50""");
        return scanner.nextInt();
    }

    //consider using an else/if statement here...
    public boolean promptToastingOptions() {
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

    //try to create a cute chart here
    //will need extra if options to remove regular topping
    //included, maybe no extra...will figure out as i go
    //had weird feeling this method and the next were the same, they are not...need to read better

    public String displayIncludedToppings(Sandwich sandwich) {
        while (true) {
            System.out.println("""
                    ===============================================
                    ||The following toppings are free of Charge:  ||
                    || Lettuce                                    ||
                    || Peppers                                    ||
                    || Onions                                     ||
                    || Tomatoes                                   ||
                    || Jalapenos                                  ||
                    || Cucumbers                                  ||
                    || Pickles                                    ||
                    || Guacamole                                  ||
                    || Mushrooms                                  ||
                    ===============================================
                    => Please select your TOPPINGS and/or DONE to finish <=
                    => Please input one at a time =^>.<^=""");

            String toppingType = scanner.next().toLowerCase();
            if (toppingType.equals("done"))
                break;
            sandwich.addToppings(new Topping(toppingType, false, false));
        }
        //had to place return option, java got angry :(

        return "";
    }

    //while loop goes here...show meat options first, use scanner
    //dont forget the breaks again!!
    //signature!! forgot to put in the parameters...


    public void showAndPromptMeatSelection(Sandwich sandwich) {
        while (true) {
            System.out.println("""
                    The following Meats are pre-meow-m toppings:
                    |------------------------------------------------|
                    |Type:       | 4"        |8"         |12"        |
                    |Steak       |$1.00      |$2.00      |$3.00      |
                    |Ham         |$1.00      |$2.00      |$3.00      |
                    |Salami      |$1.00      |$2.00      |$3.00      |
                    |Roast Beef  |$1.00      |$2.00      |$3.00      |
                    |Chicken     |$1.00      |$2.00      |$3.00      |
                    |Bacon       |$1.00      |$2.00      |$3.00      |
                    |Extra Meat  |$0.50      |$2.00      |$3.00      |
                    
                    => Please ENTER a MEAT selection and/or DONE to finish <=
                    => Please enter one at a time, thank you =^>.<^=""");

            String meatType = scanner.next().toLowerCase();
            if (meatType.equals("done"))
                break;
            System.out.println("""
                    Would you like extra Meat? It'll cost ya extra on top of premium prices...
                    Yes or No:
                    """);
            boolean extra = scanner.next().equalsIgnoreCase("yes");

            sandwich.addMeat(new Meat(meatType, extra));
            //forgot parameters in method above, did not work without the parameters...went back and added them...
            //per java recommendation, went with ignore case

        }

    }

    //forgot the parameters again, had ot go back to readd them...sigh
    //trying to make boxes even
    public void showAndPromptCheeseSelection(Sandwich sandwich) {
        while (true) {
            System.out.println("""
                    We Have Cheese! Ipsy LOVES Cheese!! =^>.<^=
                    |----------------------------------------|
                    |Type           |4"     |8"     |12"     |
                    |American       |$0.75  |$1.50  |$2.25   |
                    |Provolone      |$0.75  |$1.50  |$2.25   |
                    |Cheddar        |$0.75  |$1.50  |$2.25   |
                    |Swiss          |$0.75  |$1.50  |$2.25   |
                    |Extra Cheese   |$0.30  |$0.60  |$0.60   |
                    
                    => Please ENTER a CHEESE selection and/or DONE to finish <=
                    => Please enter one at a time, thank you! =^>.<^=""");

            String cheeseType = scanner.next().toLowerCase();
            if (cheeseType.equals("done"))
                break;
            System.out.println("""
                    Would you like Extra Cheese? It'll cost ya extra on top of premium prices...
                    Yes or NO:
                    """);
            boolean extra = scanner.next().equalsIgnoreCase("yes");

            sandwich.addCheese(new Cheese(cheeseType, extra));
        }
    }

    public void showAndPromptSauces(Sandwich sandwich) {
        while (true) {
            System.out.println("""
                    We Have Sauces Too! They're Included!!
                    |------------------|
                    |Mayo              |
                    |Mustard           |
                    |Ketchup           |
                    |Ranch             |
                    |Thousand Island   |
                    |Vinaigrette       |
                    
                    => Please ENTER a Sauce selection and/or DONE to finish <=
                    => Please enter on eat a time, thank you =^>.<^=""");
            String sauceType = scanner.next().toLowerCase();
            if (sauceType.equals("done"))
                break;
            sandwich.addSauce(new Sauce(sauceType));
            //sauce only has a type...so type!
        }
    }

    public void showAndPromptSides(Sandwich sandwich) {
        while (true) {
            System.out.println("""
                    We Have Sides, just like how Hyde is a Side Cat
                    They are included Too!
                    |---------|
                    |Au Jus   |
                    |Sauce    |
                    => Please ENTER a Side selection and/or DONE to finish <=
                    =>Please enter one at a time, thank you =^>.<^=""");
            String sideType = scanner.next().toLowerCase();
            if (sideType.equals("done"))
                break;
            sandwich.addSide(new Side(sideType));
            //forgot parameters for constructor...had to go back and add them...
        }
    }

    public Drink showAndPromptDrink () {

        System.out.println("""
                We get Water and Catnip Tea. What do you want to Drink?
                |--------------|
                |Size   | Price|
                |Small  |$2.00 |
                |Medium |$2.50 |
                |Large  |$3.00 |
                 => PLEASE INPUT S, M, OR L for drink side and then DONE to finish. Use the Letter""");

            //not like the rest of the classes, had to go back to fix this
            //same for chips class
            //do not repeat like previous classes
            //has a switch case!!!!

//            String size = " ";
        String choice = scanner.nextLine().trim().toUpperCase();

//        scanner.nextLine();

        String size;
        switch (choice) {
            case "S":
                size = "Small";
                break;
            case "M":
                size = "Medium";
                break;
            case "L":
                size = "Large";
                break;
           default:
               System.out.println("Oh come onnn...choose a drink size or you're stuck with a small");
               size = "Small";
               break;
        }

        System.out.println("""
                 We have some Options:
                 |=======================|
                 |Coke, Diet Coke, etc.  |
                 |Lemonade               |
                 |Water                  |
                 |Tea                    |
                 => Enter your Selection <=""");
        String drinkName = scanner.nextLine().trim();

        return new Drink(drinkName, size);

    }

    public Chips promptAndShowChips() {
        System.out.println("""
                WE HAVE A CHIP WALL!!!
                |=======================================|
                |Each bag is $1.50                      |
                |Choose any bag from along the wall     |
                |Our Chip flavors:                      |
                |Baked, Classic, Sriracha, Mega Spicy   |
                |Sea Salt, Sour Cream, Ranch            |
                |The chips will be added automatically  |
                |PLease grab them after paying          |""");

        String typeOfChip = scanner.nextLine().trim();
        return new Chips(typeOfChip);
    }

    //flashbacks to the last capstone :(
    public void run() {
        boolean running = true;

        while (running) {
         int choice = showHomeScreen();

         switch (choice) {
             case 1:
                 createNewOrder();
                 break;
             case 0:
                 System.out.println("Thank MEW for visiting! Come again =^>.<^= ");
                 running = false;
                 break;
             default:
                 System.out.println("Wait, did you swat at teh wrong choice? Try again!! (mm) (mm)");
         }

        }
        scanner.close();
    }

    private void createNewOrder() {
        currentOrder = new Order();
        boolean orderInProgress = true;

        while (orderInProgress) {
            int choice = showOrderMenu();

            switch (choice) {
                case 1:
                    addSandwich();      //shout out to previous capstone, i did not enjoy this part
                    break;
                case 2:
                    Drink drink = showAndPromptDrink();
                    currentOrder.addDrink(drink);
                    System.out.println("Drink added");
                    break;
                case 3:
                    Chips chips = promptAndShowChips();
                    currentOrder.addChips(chips);
                    System.out.println("Chips added");
                    break;
                case 4:
                checkout();
                orderInProgress = false;
                break;
                case 0:
                    System.out.println("Nooo, why'd MEW cancel the order?");  //cat puns, gotta love them
                    currentOrder = null;  //java suggestion, java was very mad without it
                    orderInProgress = false;
                    break;
                default:
                    System.out.println("You swatted the wrong thong, invalid option");
            }
        }
    }

    private void addSandwich() {
        //ahhh, all the fun parts are here at last!!

        //this one will get the bread type!!
        String breadType = promptForBreadTypes();

        //this one will get the size for the food
        int size = promptForAvailableSize();

        //toasted? this method shows the options...cat loaves are cute
        boolean toasted = promptToastingOptions();

        //creating the sammy now
        Sandwich sandwich = new Sandwich(breadType, size, toasted);

        //these are the meats, cheese, my regular toppings, sauces, adn sides
        //low-key reminds me of the firework finale for new years or fourth of july
        showAndPromptMeatSelection(sandwich);
        showAndPromptCheeseSelection(sandwich);
        displayIncludedToppings(sandwich);
        showAndPromptSauces(sandwich);
        showAndPromptSides(sandwich);

        //omg that was kind of fun

        currentOrder.addSandwich(sandwich);
        System.out.println("Sandwich created and added to order, so hungry. Munch munch time!!");

    }

    private void checkout() {
        if (currentOrder == null) { //does not exist
            System.out.println("No orders, going to starve now.");
            return;
        }
                            //move to next line!!
        System.out.println("\n" + currentOrder.getOrderSummary());

        System.out.println("""
                |---------------|
                |Confirm Order: |
                |Yes or No      |
                |=> Please type your answer""");
        String confirm = scanner.nextLine().trim().toLowerCase();

        if (confirm.equals("yes")) {
            ReceiptWriter.saveReceipt(currentOrder);
            System.out.println("Order complete! Yay! Our friends will eat in your honor! =^>.<^=");
        } else {
            System.out.println("Order Cancelled; we hope you try us another time.");
        }
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