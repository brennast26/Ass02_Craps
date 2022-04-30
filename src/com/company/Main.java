package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
	    Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String Cont = "";
        boolean x = false;
        while(!Cont.equals("N"))
        {
            while (!x) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int crapsRoll = die1 + die2;
                int ThePoint = 0;
                System.out.println("The first number is " + die1);
                System.out.println("The second number is " + die2);
                System.out.println("The sum of the rolls is " + crapsRoll);
                if ((crapsRoll== 2) || (crapsRoll == 3) || (crapsRoll == 12)) {
                    System.out.println("Craps, you loose!");
                    break;

                } else if ((crapsRoll == 7) || (crapsRoll == 11)) {
                    System.out.println("Natural, you win!");
                    break;
                }
                else
                {
                    boolean y = false;
                    while(!y) {
                        ThePoint = crapsRoll;
                        System.out.println("The point, roll again.");
                        System.out.println("\nThe target number is " + ThePoint);
                        int die3 = rnd.nextInt(6) + 1;
                        int die4 = rnd.nextInt(6) + 1;
                        int crapsRoll2 = die3 + die4;
                        System.out.println("The first number is " + die3);
                        System.out.println("The second number is " + die4);
                        System.out.println("The sum of the rolls is " + crapsRoll2);

                        if (crapsRoll2 == 7) {
                            System.out.println("Sorry you loose!");
                            y = true;
                            x = true;
                        } else if (crapsRoll2 == ThePoint) {
                            System.out.println("You hit the target number, You Win!");
                            break;
                        }
                    }break;
                }

            }x = true;
            System.out.println("Would you like to play again, Y or N?");
            Cont = in.nextLine();
            if(Cont.equalsIgnoreCase("Y"))
            {
                System.out.println("New game!");
                x = false;
            }
            else
            {
                System.out.println("Have a good day.");
                break;
            }
        }

    }
}
