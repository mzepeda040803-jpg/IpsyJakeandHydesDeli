# Ipsy, Jake, & Hyde's Deli

## What is it?
I have a fever dream  of opening a Cat Cafe when I retire. A cat cafe is a cafe that offers a 
separate room where cats can roam freely. While I may not be close to that yet, I can live that dream 
through this project. This project practices Object Oriented Programming, Class Creation and organization,
as well as looping through various menus with different methods attached to them.

This App is a basic Sandwich/Wrap builder with the ability to customize your order, add drinks adn chips, and
display a receipt. One thing to note about this project is the practice of organizing the classes
into groups that make sense and practicing choosing between extending classes or making them abstract.

### Let Me Walk You Through It
You are shown the home menu, featuring some cat faces and information regarding the deli.
You are prompted to start a new order or exit the app; following that you are shown a menu
that defines the structure of how you will build your order.

You start with the type of bread you would like, you can also choose to get a wrap instead;
following that you are prompted to choose an order size. When the size is selected, you can choose
to have it toasted. The regular toppings are displayed, where you can choose your toppings on eby one.
YOu can also add extra; then Meats and Cheeses are displayed. These Classes were extensions of the 
topping class; you run through the items and can add extra if you wish.

Sauce options are also available; of which sides follow suit. You then get a menu prompt where you can
add a drink with size; the same goes for the chips options, minus choosing a size.

The Code rounds off with your order being put together, for which you confirm your order.

After your order is confirmed, you get a receipt with your order details. The fun part: there are 
cat puns and cat sarcasm littered throughout the program. See if you can find them all. On a side note,
can you see some of the frustration coming in through my comments?

## My favorite part of the Code:
```java
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
```
As much as I struggled to write everything, using keyboard and IntelliJ shortcuts to write this out
was so SATISFYING. It was the equivalent of all the fireworks going off at once
at the end of a show. The grand finale...the "finally everything is coming together!!" 
Of course the last method followed suit but still, it was so satisfying to write, It was my favorite part.

## This is my Diagram for the project, it was not fun

Add image:
![Class Diagram]![](C:\Users\Student\Pictures\Screenshots\Screenshot 2025-11-14 080551.png)



