
/**
 * These are 9 of the labs I have done for intro to java. 
 * It is not the prettiest code ever written, in fact its terribly messy,
 * but as far as I can tell, everything works.
 */
import java.util.Scanner;

public class AllPrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char runAgain = 'N';

        do {

            System.out.printf("%-7s %4s %15s\n", "Lab: ", "  Type:",
                    "Description:");
            System.out.printf("%-7s %4s %4s\n", "Lab 1", " 1",
                    " (First Assignment, basic println)");
            System.out.printf("%-7s %4s %4s\n", "Lab 2", " 2",
                    " (Coin Counter)");
            System.out.printf("%-7s %4s %4s\n", "Lab 3", " 3",
                    " (Shirt Shop)");
            System.out.printf("%-7s %4s %4s\n", "Lab 4", " 4",
                    " (Shell Game)");
            System.out.printf("%-7s %4s %4s\n", "Lab 5", " 5",
                    " (First Test, Geometry Calculator)");
            System.out.printf("%-7s %4s %4s\n", "Lab 6", " 6",
                    " (Race To 21 Game)");
            System.out.printf("%-7s %4s %4s\n", "Lab 7", " 7",
                    " (Stock Sales Calculator)");
            System.out.printf("%-7s %4s %4s\n", "Lab 8", " 8",
                    " (Virtual Piggy Bank)");
            System.out.printf("%-7s %4s %4s\n\n", "Lab 9", " 9",
                    " (Equal Sums Square Generator)");

            System.out.print("Enter the lab number you would like to do: ");
            int labNum = input.nextInt();

            if (labNum < 1 || labNum > 7) {
                while (labNum < 1 || labNum > 9) {
                    System.out.println("Invalid input, try again");
                    System.out.print("Enter the lab number you would like to do: ");
                    labNum = input.nextInt();
                }
            }

            switch (labNum) {
                case 1:
                    //Lab 1
                    System.out.println("You picked Lab 1!");
                    System.out.println("My name is _____ _______");
                    System.out.println("I live in ___________________");
                    System.out.println("I am a __________ major at __________");
                    System.out.println("I am currently a __________");
                    break;
                case 2:
                    //lab 2
                    System.out.println("you picked Lab 2!");

                    System.out.print("Enter an interger dollar amount: ");  
                    //prompt theuser for a dollar amount
                    int dollarAmount = input.nextInt(); //declare the interger 
                    //dollarAmount

                    System.out.print("Enter an int amount of change: "); //prompt 
                    //the user for the amount of change
                    int changeAmount = input.nextInt();//declare the interger 
                    //changeAmount

                    int totalPennies = (dollarAmount * 100) + changeAmount;
                    //initialize interger totalPennies to track the amount of pennies
                    int quarters = totalPennies / 25; //initialize interger dimes
                    totalPennies = totalPennies % 25;//reduce the totalPennies
                    int dimes = totalPennies / 10;//initialize interger dimes
                    totalPennies = totalPennies % 10;//reduce the totalPennies
                    int nickles = totalPennies / 5;//initialize interger nickles
                    totalPennies = totalPennies % 5;//reduce the totalPennies
                    int pennies = totalPennies;//initialize interger pennies

                    System.out.println("The coins are as follows");
                    System.out.println("quarters: " + quarters); //print the 
                    //amount of quarters
                    System.out.println("dimes: " + dimes);//print the 
                    //amount of dimes
                    System.out.println("nickles: " + nickles);//print the 
                    //amount of nickles
                    System.out.println("pennys: " + pennies);//print the 
                    //amount of pennies
                    break;
                case 3:
                    //lab 3
                    System.out.println("You picked Lab 3!");
                    //Greet the customer
                    System.out.println("Welcome to the Shirt Shop!");

                    //ask what type of shirt they would like
                    System.out.println("\nWhat type of shirt would you like?");
                    System.out.println("1 Sweatshirt");
                    System.out.println("2 hoodie");

                    //prompt the user for their shirt choice
                    System.out.print("\nEnter the number of your choice: ");

                    //store their decision as shirtChoice
                    int shirtChoice = input.nextInt();

                    //ask if they want a screen print
                    System.out.println("\nWould you like a screen print?");
                    System.out.println("1 for yes");
                    System.out.println("2 for no");

                    //get users choice for screen print
                    System.out.print("\nEnter the number of your choice: ");
                    int screenPrintChoice = input.nextInt();

                    //ask for the users age
                    System.out.print("\nHow old are you? ");
                    int age = input.nextInt();

                    //declare variable
                    double totalCost;
                    int discount = 0;

                    //declare constant SENIOR_CITIZEN
                    final int SENIOR_CITIZEN = 63;

                    //check shirt choice
                    if (shirtChoice == 1) {
                        totalCost = 18.95;
                        System.out.println("\nShirt Type: Sweatshirt");
                    } else {
                        totalCost = 24.95;
                        System.out.println("\nShirt Type: Hoodie");
                    }

                    //check for screen print request
                    if (screenPrintChoice == 1) {
                        totalCost += 5.95;
                        System.out.println("Screen Print: Yes");
                    } else {
                        System.out.println("Screen Print: No");
                    }

                    //display the initial price
                    System.out.println("Initial Price: " + totalCost);

                    //check for senior discount
                    if (age >= SENIOR_CITIZEN) {
                        totalCost = totalCost - (0.1 * totalCost);
                        discount = 1;
                        System.out.println("Discount Applied: 10%");
                    } else {
                        System.out.println("Discount Applied: 0%");
                    }

                    //display the final cost
                    System.out.println("Final Cost: " + totalCost);

                    //display thank you message
                    System.out.println("Thank you for shopping the Shirt "
                            + "Shop!");
                    break;
                case 4:
                    //lab 4
                    System.out.println("You picked Lab 4!");
                    //welcome the user
                    System.out.println("Welcome to the Shell Game!");

                    //win counter
                    int winCounter = 0;
                    //loss counter
                    int lossCounter = 0;

                    //state the round number and shell options, then ask 
                    //them to pick one
                    System.out.println("\nRound 1");
                    System.out.print("Pick a Shell (1, 2, or 3): ");

                    //get user input
                    int firstGuess = input.nextInt();

                    //generate random number
                    int firstRandomNumber = (int) ((Math.random() * 10)
                            % 3 + 1);

                    //if statement do determine if answer is correct
                    if (firstGuess == firstRandomNumber) {
                        System.out.print("The ball is under shell: "
                                + firstRandomNumber + ". You Win! \n");
                        winCounter += 1;
                    } else {
                        System.out.print("The ball is under shell: "
                                + firstRandomNumber + ". You Lose! \n");
                        lossCounter += 1;
                    }

                    //state the round number and shell options, then ask 
                    //them to pick one
                    System.out.println("\nRound 2");
                    System.out.print("Pick a Shell (1, 2, or 3): ");

                    //get user input
                    int secondGuess = input.nextInt();

                    //generate random number
                    int secondRandomNumber = (int) ((Math.random() * 10)
                            % 3 + 1);

                    //if statement do determine if answer is correct
                    if (secondGuess == secondRandomNumber) {
                        System.out.print("The ball is under shell: "
                                + secondRandomNumber + ". You Win! \n");
                        winCounter += 1;
                    } else {
                        System.out.print("The ball is under shell: "
                                + secondRandomNumber + ". You Lose \n");
                        lossCounter += 1;
                    }

                    //state the round number and shell options, then ask 
                    //them to pick one
                    System.out.println("\nRound 3");
                    System.out.print("Pick a Shell (1, 2, or 3): ");

                    //get user input
                    int thirdGuess = input.nextInt();

                    //generate random number
                    int thirdRandomNumber = (int) ((Math.random() * 10)
                            % 3 + 1);

                    //if statement do determine if answer is correct
                    if (thirdGuess == thirdRandomNumber) {
                        System.out.print("The ball is under shell: "
                                + thirdRandomNumber + ". You Win! \n");
                        winCounter += 1;
                    } else {
                        System.out.print("The ball is under shell: "
                                + thirdRandomNumber + ". You Lose \n");
                        lossCounter += 1;
                    }

                    //readability
                    System.out.println("\n<----------------------------->");

                    //tell user how many times they won
                    System.out.println("End of Game. You won: " + winCounter
                            + " out of 3 rounds");

                    //switch statement to display wins or losses
                    switch (winCounter) {
                        case 0:
                        case 1:
                            System.out.println("Better luck next time!");
                            break;
                        case 2:
                            System.out.println("You're pretty clever!");
                            break;
                        case 3:
                            System.out.println("Are you psychic?");
                    }

                    //readability
                    System.out.println("<----------------------------->");

                    //say goodbye
                    System.out.println("\nGoodbye!");
                    break;
                case 5:
                    //lab 5
                    System.out.println("You picked Lab 5!"
                            + "(The first programming test)");
                    //prompt the user to see if they want to find the area or primeter
                    System.out.println("Would you like to find the area or primeter of an object?");
                    System.out.println("Type 1 to find the area, or Type 2 to find the perimeter");
                    System.out.print("Choice: ");

                    //read in the users choice
                    int firstInput = input.nextInt();

                    //ask the user what type of object they would like to use
                    System.out.println("\nWhat type of object would you like to use? ");
                    System.out.println("Type 1 for Circle \nType 2 for Triangle \nType 3 for Rectangle");
                    System.out.print("Choice: ");

                    //read in the users choice
                    int objectType = input.nextInt();

                    //if statement to determine area or perimeter
                    if (firstInput == 1) {
                        //switch statement to determine object
                        switch (objectType) {
                            case 1: //get the radius of the circle
                                System.out.print("Enter the circles radius: ");
                                double circleRadius = input.nextDouble();

                                //calculate the area
                                double circleArea = circleRadius * circleRadius * Math.PI;

                                //return the area
                                System.out.println("The area of a circle with radius " + circleRadius + " is: " + circleArea);
                                break;
                            case 2: //get the base and height of the triangle
                                System.out.print("Enter the length of the triangles base: ");
                                double triangleBase = input.nextDouble();
                                System.out.print("Enter the height of the triangle: ");
                                double triangleHeight = input.nextDouble();

                                //calculate the area
                                double triangleArea = 0.5 * triangleBase * triangleHeight;

                                //return the area
                                System.out.println("The area of a triangle with a base of " + triangleBase + " and a height of " + triangleHeight + " is: " + triangleArea);
                                break;
                            case 3: //get the lentgh and width of the rectangle
                                System.out.print("Enter the rectangles length: ");
                                double rectangleLength = input.nextDouble();
                                System.out.print("Enter the width: ");
                                double rectangleWidth = input.nextDouble();

                                //calculate the area
                                double rectangleArea = rectangleLength * rectangleWidth;

                                //return area
                                System.out.println("The area of a rectangle of length " + rectangleLength + " and height " + rectangleLength + " is: " + rectangleArea);
                                break;
                        }
                    } else {
                        //switch statement to determine object
                        switch (objectType) {
                            case 1: //get the radius of the circle
                                System.out.print("Enter the circles radius: ");
                                double circleRadius = input.nextDouble();

                                //calculate the area
                                double circlePerimeter = circleRadius * 2 * Math.PI;

                                //return the area
                                System.out.println("The perimeter of a circle with radius " + circleRadius + " is: " + circlePerimeter);
                                break;
                            case 2: //get the side lengths of the triangle
                                System.out.print("Enter the length of side 1: ");
                                double triangleSide1 = input.nextDouble();
                                System.out.print("Enter the length of side 2: ");
                                double triangleSide2 = input.nextDouble();
                                System.out.print("Enter the length of side 3: ");
                                double triangleSide3 = input.nextDouble();

                                //calculate the area
                                double trianglePerimeter = triangleSide1 + triangleSide2 + triangleSide3;

                                //return the area
                                System.out.println("The perimeter of a triangle with side lengths of " + triangleSide1 + ", " + triangleSide2 + ", and " + triangleSide3 + " is: " + trianglePerimeter);
                                break;
                            case 3: //get the lentgh and width of the rectangle
                                System.out.println("Enter the rectangles length: ");
                                double rectangleLength = input.nextDouble();
                                System.out.print("Enter the width: ");
                                double rectangleWidth = input.nextDouble();

                                //calculate the area
                                double rectanglePerimeter = (2 * rectangleLength) + (2 * rectangleWidth);

                                //return area
                                System.out.println("The perimeter of a rectangle of length " + rectangleLength + " and width " + rectangleWidth + " is: " + rectanglePerimeter);
                                break;
                        }
                    }
                    break;
                case 6:
                    //lab 6
                    System.out.println("You picked lab 6!");
                    //greet the players
                    System.out.println("Hello, welcome to the race to 21 game!");
                    System.out.println("Choose who will be player 1 and who will be player 2");

                    //ask if the player 1 would like to roll the dice
                    System.out.println("Would player 1 like to roll the dice? Type Y for yes, and N for no");
                    System.out.print("Choice: ");
                    char playChoice1 = input.next().charAt(0);

                    //create the total 
                    int dieTotalPlayer1 = 0;

                    //check if player 1 wants to roll
                    if (playChoice1 == 'Y') {
                        while (playChoice1 == 'Y') {

                            //create random numbers for the dice
                            int die1 = (int) (Math.random() * 10 % 6) + 1;
                            int die2 = (int) (Math.random() * 10 % 6) + 1;

                            //calculate the total
                            dieTotalPlayer1 += die1 + die2;

                            //check to see if the total is over 21
                            if (dieTotalPlayer1 > 21) {
                                System.out.println("Total: " + dieTotalPlayer1);
                                System.out.println("Oh bummer you're over 21! Your total has been set to zero");
                                //reset the total to 0
                                dieTotalPlayer1 = 0;
                                //escape out of the loop
                                playChoice1 = 'N';
                            } else {

                                //print out the total and ask if they want to roll again
                                System.out.println("Your total is currently: " + dieTotalPlayer1 + " Would you like to roll again?");
                                System.out.println("Type Y for yes, type N for no");
                                System.out.print("Choice: ");
                                playChoice1 = input.next().charAt(0);
                            }
                        }
                    }
                    //create the second players choice
                    char playChoice2;

                    //create the second players total
                    int dieTotalPlayer2 = 0;

                    //ask if the player 2 would like to roll the dice
                    System.out.println("Would player 2 like to roll the dice? Type Y for yes, and N for no");
                    System.out.print("Choice: ");
                    playChoice2 = input.next().charAt(0);

                    //check if player 2 wants to roll
                    if (playChoice2 == 'Y') {
                        while (playChoice2 == 'Y') {

                            //create random numbers for the dice
                            int die1 = (int) (Math.random() * 10 % 6) + 1;
                            int die2 = (int) (Math.random() * 10 % 6) + 1;

                            //calculate the total
                            dieTotalPlayer2 += die1 + die2;

                            //check to see if the total is over 21
                            if (dieTotalPlayer2 > 21) {
                                System.out.println("Total: " + dieTotalPlayer2);
                                System.out.println("Oh bummer you're over 21! Your total has been set to zero");
                                //reset the total to 0
                                dieTotalPlayer2 = 0;

                                //escape out of the loop
                                playChoice2 = 'N';
                            } else {

                                //print out the total and ask if they want to roll again
                                System.out.println("Your total is currently: " + dieTotalPlayer2 + " Would you like to roll again?");
                                System.out.println("Type Y for yes, type N for no");
                                System.out.print("Choice: ");
                                playChoice2 = input.next().charAt(0);
                            }
                        }
                    }

                    //compare the final scores
                    if (dieTotalPlayer1 > dieTotalPlayer2) {
                        System.out.println("CONGRATULATIONS PLAYER 1, YOU WIN!");
                    } else if (dieTotalPlayer2 > dieTotalPlayer1) {
                        System.out.println("CONGRATULATIONS PLAYER 2, YOU WIN!");
                    } else {
                        System.out.println("It was a tie!");
                    }
                    break;
                case 7:
                    //lab 7
                    System.out.println("You picked Lab 7!");
                    //welcome user
                    System.out.println("\nWelcome to the stock profit calculator!\n");

                    //ask the user for number of transactions
                    System.out.println("How many transactions would you like to calculate?");
                    System.out.print("Transactions: ");
                    int numTransactions = input.nextInt();

                    int counter = numTransactions;//create counter

                    double tTotal = 0;

                    double total = 0;//total profit / loss

                    //create loop for amount of times stock sold
                    do {
                        //ask for number of shares
                        System.out.print("Enter the number of shares: ");
                        int ns = input.nextInt();

                        //ask for purchase price
                        System.out.print("Enter the purchase price: $");
                        double pp = input.nextDouble();

                        //ask for purchase comission
                        System.out.print("Enter the purchase comission: $");
                        double pc = input.nextDouble();

                        //ask for sale price
                        System.out.print("Enter the sale price: $");
                        double sp = input.nextDouble();

                        //ask for sale comission
                        System.out.print("Enter the sale commission: $");
                        double sc = input.nextDouble();

                        //readability
                        System.out.println("-----------------------------");

                        //call the profit method
                        tTotal = profit(ns, pp, pc, sp, sc);
                        total += tTotal;

                        //print the current and running total
                        System.out.printf("Transaction profit %5.2f", tTotal);
                        System.out.println();
                        System.out.printf("Current running profit %5.2f", total);
                        System.out.println();
                        System.out.println("-----------------------------");

                        //deincrement the counter
                        counter--;
                    } while (counter > 0);

                    //check if the total resulted in profit or loss
                    if (total > 0) {
                        System.out.printf("You made a profit of $" + "%5.2f", total);
                        System.out.println();
                    } else {
                        System.out.printf("You had a loss of $" + "%5.2f", total);
                        System.out.println();
                    }
                    break;
                case 8:
                    //lab 8
                    System.out.println("You picked Lab 8!");
                    //declare an integer array of size 12 called bank.  Set all slots to zero.
                    int[] bank = new int[12];

                    /*declare a real number array of size 12, called denom, and initialize it with the appropriate denomination values from smallest to largest denomination*/
                    double[] denom = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00, 1.00, 5.00, 10.00, 20.00, 50.00, 100.00};

                    int mainChoice,
                     addChoice,
                     removeChoice;
                    Scanner kb = new Scanner(System.in);

                    //write the welcome message here
                    System.out.println("Welcome to your piggy bank!");

                    do {
                        //call the displayMainMenu method here
                        displayMainMenu();

                        mainChoice = kb.nextInt();
                        switch (mainChoice) {
                            case 0:
                                //put the goodbye message here
                                System.out.println("Goodbye!");
                                break;
                            case 1:
                                do {
                                    //call the displayAddMenu method here
                                    displayAddMenu();

                                    addChoice = kb.nextInt();
                                    /*add statements here to handle invalid choices, valid choices, and a choice of zero. Consider using if/else statements here.*/
                                    if (addChoice < 0 || addChoice > 12) {
                                        System.out.println("\nInvalid input\n");
                                    } else {
                                        if (addChoice != 0) {
                                            bank[addChoice - 1] += 1;
                                        }
                                    }

                                } while (addChoice != 0);
                                break;
                            case 2:
                                do {
                                    //call the displayRemoveMenu here
                                    displayRemoveMenu();

                                    removeChoice = kb.nextInt();
                                    /*add statements here to handle invalid choices, valid choices, valid choices where there are no items of that denomination, and a choice of zero. Consider using if/else statements here.*/
                                    if (removeChoice < 0 || removeChoice > 12) {
                                        System.out.println("\nInvalid input\n");
                                    } else {
                                        if (removeChoice != 0) {
                                            bank[removeChoice - 1] -= 1;
                                        }
                                    }

                                } while (removeChoice != 0);
                                break;
                            case 3:
                                /*call showDenoms method (make sure to pass it both arrays with the bank array being the first argument*/
                                showDenoms(bank, denom);

                                break;
                            case 4:
                                /*call showTotal method (make sure to pass it both arrays with the bank array being the first argument*/
                                showTotal(bank, denom);

                                break;
                            default:
                                System.out.println("\nInvalid choice.  Try again.\n");
                        }
                    } while (mainChoice != 0);
                    break;
                case 9:
                    //lab 9
                    System.out.println("You picked Lab 9!");
                    //call welcome user method
                    displayWelcome();

                    //call get user input method
                    int n = getUserInput();

                    //call create initial array
                    int[][] array = createInitialArray(n);

                    //call initialize array method
                    initializeArray(array);

                    //call populate array method
                    populateArray(array, n);

                    //call method to display array
                    displayArray(array);

                    //call method to verify array
                    verifyArray(array);
                    break;

                //closing bracket for AllProg switch
            }

            System.out.print("Would you like to pick again? Y for yes, N "
                    + "for no: ");
            runAgain = input.next().charAt(0);
            if (runAgain == 'y') {
                runAgain = 'Y';
            } else if (runAgain == 'N') {
                runAgain = 'n';
            }
            System.out.println();
        } while (runAgain == 'Y');

    }

    /*
    this method calculates the profit or loss with the given informaiton
    for Lab 7
     */
    public static double profit(int ns, double pp, double pc, double sp, double sc) {

        //calculate the profit / loss
        double profit = ((ns * sp) - sc) - ((ns * pp) + pc);

        //return the profit or loss
        return profit;
    }

    public static void displayMainMenu() {
        System.out.print("0 - Exit\n"
                + "1 - Add money to bank\n"
                + "2 - Remove money from bank\n"
                + "3 - Show quantity of each denomination\n"
                + "4 - Show total value in bank\n"
                + "Enter your choice: ");
    }

    public static void displayAddMenu() {
        System.out.print("0-Quit adding money\n"
                + "1-Add a penny\n"
                + "2-Add a nickel\n"
                + "3-Add a dime\n"
                + "4-Add a quarter\n"
                + "5-Add a half-dollar\n"
                + "6-Add a dollar coin\n"
                + "7-Add a 1 dollar bill\n"
                + "8-Add a 5 dollar bill\n"
                + "9-Add a 10 dollar bill\n"
                + "10-Add a 20 dollar bill\n"
                + "11-Add a 50 dollar bill\n"
                + "12-Add a 100 dollar bill\n"
                + "Enter your choice: ");
    }

    public static void displayRemoveMenu() {
        System.out.print("0-Quit removing money\n"
                + "1-Remove a penny\n"
                + "2-Remove a nickel\n"
                + "3-Remove a dime\n"
                + "4-Remove a quarter\n"
                + "5-Remove a half-dollar\n"
                + "6-Remove a dollar coin\n"
                + "7-Remove a 1 dollar bill\n"
                + "8-Remove a 5 dollar bill\n"
                + "9-Remove a 10 dollar bill\n"
                + "10-Remove a 20 dollar bill\n"
                + "11-Remove a 50 dollar bill\n"
                + "12-Remove a 100 dollar bill\n"
                + "Enter your choice: ");
    }

    /*write the showDenoms method here.  This method should accept an integer array followed by a double array.  It should show a table of each denomination followed by how many items of that denomination are in the bank.  It should not return anything.*/
    public static void showDenoms(int[] bank, double[] denom) {
        for (int i = 0; i < 12; i++) {
            System.out.printf("$ %6.2f - %-4d", denom[i], bank[i]);
            System.out.println();
        }
    }

    /*write the showTotal method here.  This method should accept an integer array followed by a double array.  If should calculation the total value in the bank and display that result.  It should not return anything.*/
    public static void showTotal(int[] bank, double[] denom) {
        double total = 0;
        for (int i = 0; i < 12; i++) {
            total += bank[i] * denom[i];
        }
        System.out.printf("The total amount in the bank is $%,6.2f\n", total);
    }

    //welcome user method
    public static void displayWelcome() {

        //welcome user
        System.out.println("Welcome!");
    }

    //method gets user input
    public static int getUserInput() {

        //create scanner
        Scanner input = new Scanner(System.in);

        //get interger from user
        System.out.print("Enter a positive, odd interger: ");
        int number = input.nextInt();

        if (number < 0 || number % 2 == 0) {
            System.out.println("INVALID NUMBER");
            do {
                System.out.print("Enter a positive, odd interger: ");
                number = input.nextInt();
            } while (number < 0 || number % 2 == 0);
        }

        return number;
    }

    //method creates array with zero values
    public static int[][] createInitialArray(int n) {

        int[][] myArr = new int[n][n];

        return myArr;
    }

    //method initializes the array with all zeros
    public static void initializeArray(int[][] array) {

        //initialize values to zero
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = 0;
            }
        }
    }

    //method to populate array 
    public static void populateArray(int[][] array, int a) {

        //create intergers to populate array
        int row = a - 1;
        int col = a / 2;

        array[row][col] = 1;

        //loop structure to wrap around edges and place numbers
        for (int i = 2; i <= a * a; i++) {
            if (array[(row + 1) % a][(col + 1) % a] == 0) {
                row = (row + 1) % a;
                col = (col + 1) % a;
            } else {
                row = (row - 1) % a;
            }
            array[row][col] = i;
        }
    }

    //method to display array
    public static void displayArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%4d", array[row][column]);
            }
            System.out.println();
        }
    }

    //method to verify array
    public static void verifyArray(int[][] array) {

        //int to keep track of totals
        int total = 0;

        //loop to add rows
        for (int row = 0; row < array.length; row++) {
            total = 0;
            for (int column = 0; column < array[row].length; column++) {
                total += array[row][column];
                System.out.print(array[row][column] + " + ");
            }
            System.out.println(" = " + total);
        }

        //loop to add columns
        for (int col = 0; col < array.length; col++) {
            total = 0;
            for (int row = 0; row < array[col].length; row++) {
                total += array[row][col];
                System.out.print(array[row][col] + " + ");
            }
            System.out.println(" = " + total);
        }
        total = 0;
        //loop for first diagional
        for (int i = 0; i < array[0].length; i++) {

            total += array[i][i];
            System.out.print(array[i][i] + " + ");
        }
        System.out.println(" = " + total);

        //I didnt have time to do the last diagional! :(
    }

}
