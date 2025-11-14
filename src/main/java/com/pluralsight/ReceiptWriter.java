package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static String generateTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return LocalDateTime.now().format(formatter);
//        LocalDateTime now = LocalDateTime.now();
//        return now.format(formatter);
    }


    public static void saveReceipt(Order order) {
        String timestamp = generateTimeStamp();
        String fileName = "src/main/resources/receipts/" + timestamp + ".txt";
        //had to hard code this part...I could not figure it out
        //gave me a literal headache
        //eventually said screw it, it can stay there, i'm sorry

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(order.getOrderSummary());

            System.out.println("Receipt saved to: " + fileName);
        } catch (IOException e) {
            System.out.println("Error: Couldn't save receipt, it's under the fridge with the toys!");
            e.printStackTrace();
        }


    }
//        //accidentally made into string at first, fixed
//        //date formatter, pulled from the sheet with project breakdown
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmm");
//
//        //this part took a while to put together...made java very angry
//        LocalDateTime now = LocalDateTime.now();
//        return now.format(formatter);
//
//        //buffered writer goes here...will take a while, we'll see how it turns out
//        //file part is tricky, java still mad at me
//
//        try {
//            FileWriter fileWriter = new FileWriter(fileName);
//
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("Order Summary");
//
//        } catch (IOException e) {
//
//            System.out.println("Error: Unable to print, see cashier");
//            e.getStackTrace();
//        }
//            FileWriter fileWriter = new BufferedWriter(new FileWriter(filename))) {
//        }catch
//    }

    //create file for order receipts to be printed in
    //use buffered writer to write to file
    //use local time/date parts from java
    //also, must create a new receipt with every order
    //harder than it looks, sad face
    //go find the buffered reader/writer example in the workbooks!!
}
