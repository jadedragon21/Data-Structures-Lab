package com.tts;
import java.util.*;
import java.util.HashMap;

public class StansCareDealership {

//    public static void main(String[] args) {
            private final HashMap<String, String> careLot = new HashMap<>();
            private final String[] DFALT_CARES = {
                   //  make,model
                    "Chevy","Corvette Stingray",
                    "Chevy","Silverado",
                    "Chevy","Tahoe",
                    "Chevy","Suburban",
                    "Chevy","Impala",
                    "Chevy","Blazer",
                    "Dodge","Viper",
                    "Dodge","Avenger",
                    "Dodge","Challenger",
                    "Dodge","Charger",
                    "Dodge","Journey",
                    "Dodge","Challenger SRT Hellcat",
                    "Ford","Edge",
                    "Ford","Mustang Shelby GT 500",
                    "Ford","Super Duty",
                    "Ford","Focus ST",
                    "Ford","Fusion",
                    "Ford","Escape",
                    "Honda","CR-V",
                    "Honda","Civic",
                    "Honda","Odyssey",
                    "Honda","Ridgeline",
                    "Honda","Accord",
                    "Honda","Pilot",
                    "Subaru","Outback",
                    "Subaru","Forester",
                    "Subaru","WRX",
                    "Subaru","BRZ",
                    "Subaru","Crosstrek",
                    "Subaru","Ascent",
                    "Audi","RS Q8",
                    "Audi","RS5",
                    "Audi","A8 Horch",
                    "Audi","RS 7",
                    "Audi","S3",
                    "Audi","e-tron GT"
            };
            private final Scanner redQueenInSpace = new Scanner(System.in);

            public StansCareDealership() {
                addDefaultSilent();
                System.out.println("Welcome to the Stan's Care Dealership in Outer Space!");
                engageNumberOne();
                System.out.println("Thank you for coming on by our sales lot! Hope you found a sweet ride! All sales are final. Shipping to Earth is extra!");
            }

            private void engageNumberOne() {
                boolean forgingAhead = true;
                String userReply = "";
                while (forgingAhead) {
                    userReply = speakWithGuest();
                    forgingAhead = checkOptions(userReply);
                    pressEnterKey();
                }
            }

            private String speakWithGuest() {

                System.out.println("Course of Action:");
                System.out.println("1: Make search (by model)");
                System.out.println("2: List the models (by make)");
                System.out.println("3: Show me all the cares by make/model");
                System.out.println("4: Add a new care to the list");
                System.out.println("5: Empty the care lot!");
                System.out.println("6: Add the default care lot back");
                System.out.println("Q: Exiting Stage Right");


                System.out.print("Your choice: ");

                return redQueenInSpace.nextLine();
            }

            private boolean checkOptions(String reply) {
                int choice = 0;
                try {
                    choice = Integer.parseInt(reply);
                } catch (NumberFormatException e) {
                    if (reply.equalsIgnoreCase("q")) {
                        System.out.println("문제 없어요, 안녕!");
                        //found out you can program in korean cool. translated to No Problem, Goodbye!
                        return false;
                    }
                }
                switch (choice) {
                    case 1 -> makeStarSearch();
                    case 2 -> lotModels();
                    case 3 -> showWholeLot();
                    case 4 -> addNewCare();
                    case 5 -> clearLot();
                    case 6 -> addDfalt();
                    default -> sayAgain();
                }

                return true;
            }



            private void sayAgain() {
                System.out.println(" Say again?");
            }

            private void makeStarSearch() {
                System.out.println("To find the make you must first tell me the model.");
                String userModel = redQueenInSpace.nextLine();
                String theMake = careLot.get(userModel);
                if (theMake != null)
                    System.out.println("Ah yes, the " + userModel + " is created by " + theMake);
                else System.out.println("Never heard of it. It's not in this galaxy or on our lot!");
            }

            private void lotModels() {
                System.out.println("What make would you like to see our list of?");
                String userMake = redQueenInSpace.nextLine();

                List<String> modelLotList = new ArrayList<>();
                for (String care: careLot.keySet()
                ) {
                    if (careLot.get(care).equalsIgnoreCase(userMake)){
                        modelLotList.add(care);
                    }
                }
                System.out.println("Here is a list of all the cares we have on our lot from " + userMake + ":");
                for (String care:modelLotList
                ) {
                    System.out.println("* " + userMake + " " + care);
                }
                System.out.println("That is all we have from " + userMake + "!");
            }

            private void showWholeLot() {
                System.out.println("Here's the list of cares on the lot:");
                for (String car: careLot.keySet()
                ) {
                    System.out.println("* " + careLot.get(car) + " " + car);
                }
                System.out.println("That's all folks!");
            }

            private void addNewCare() {
                System.out.println("Oh! So you want to add a care to the lot?");
                System.out.println("Are you from the the Earth Merchant Alliance? Well that changes everything!");
                System.out.println("Then tell me the make:");
                String userMake = redQueenInSpace.nextLine();
                System.out.println("The model please:");
                String userModel = redQueenInSpace.nextLine();
                System.out.println("Mmhmm, so that is the " + userMake + " " + userModel + "...");
                System.out.println("Are you sure that isn't an imaginary care in your mind? I guess it is a/an " + userMake + " after all!");
                addCare(userMake,userModel);
                System.out.println("Thank you for your input into our catalog of vehicles on the lot. We will be sure to add it in 30s.");
            }

            private void clearLot() {
                System.out.println("Oh, you want to buy everything and leave us empty? Let me get the manager...");
                careLot.clear();
                System.out.println("There is nothing to see here. Our care list is empty now. I wish I could go home early but I still have paperwork. " +
                        "Goodbye and thank you for shopping at the Stan's Care Dealership in Space.");
            }

            private void addDfalt() {
                System.out.println("Adding the pre-selected cares back to the care lot...");
                for (int i = 0; i < DFALT_CARES.length; i+=2) {
                    String care1 = DFALT_CARES[i];
                    String care2 = DFALT_CARES[i+1];
                    System.out.println("Adding the " + care2 + " " + care1 + " to the lot...");
                    addCare(care1, care2);
                }
                System.out.println("Boom! Magical Space Hocus Pocus! The lot is magically back. You've bought nothing and have to start over. ");
            }

            private void addDefaultSilent(){
                for (int i = 0; i < DFALT_CARES.length; i+=2) {
                    String care1 = DFALT_CARES[i];
                    String care2 = DFALT_CARES[i+1];
                    addCare(care1, care2);
                }
            }

            private void addCare(String make, String model) {
                try{
                    careLot.put(model, make);
                } catch (IllegalArgumentException e){
                    System.out.println("There was an error adding care to the lot: " + e);
                    System.out.println("You tried to add Make: "+ make + ", Model: " + model+ ",but it didn't work!");
                }
            }

            private String getMake(String model) {
                return careLot.get(model);
            }

            private void pressEnterKey(){
                System.out.print("Press the Enter key to continue on this wonderful confusing journey into programming...");
                redQueenInSpace.nextLine();
            }

        }


