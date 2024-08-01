import java.util.Scanner;

public class Funzies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print out your name");
        String name = input.nextLine();
        System.out.print("Hello " + name + ", Welcome to FATE!");
        System.out.println("Would you like to continue?");
        String answer = input.next();
        if (answer.equals("yes"))
        {
            int random_number = ((int)(Math.random()*20));
            System.out.println("I have thought of a number from 1 - 20, enter a number below and I will let you know if that number is greater than, less than, or equal to my number.");
            int GreaterthanorLess1 = input.nextInt(); //                                                                    GreaterthanorLess1
            if (GreaterthanorLess1>random_number)
            {
                System.out.println("your number is greater than my number, you have 5 more chances.");
            }
            else if (GreaterthanorLess1<random_number)
            {
                System.out.println("my number is greater than your number, you have 5 more chances");
            }
            else
            {
                System.out.println("Wow! You have already guessed my number, good job!");
            }
            int GreaterthanorLess2 = input.nextInt(); //                                                                     GreaterthanorLess2
            if (GreaterthanorLess2>random_number)
            {
                System.out.println("your number is greater than my number, you have 4 more chances.");
            }
            else if (GreaterthanorLess2<random_number)
            {
                System.out.println("my number is greater than your number, you have 4 more chances");
            }
            else
            {
                System.out.println("Wow! You have already guessed my number, good job!");
            }
            int GreaterthanorLess3 = input.nextInt();                                                                   // Greaterthanorless3
            if (GreaterthanorLess3 > random_number)
            {
                System.out.println("your number is greater than my number, you have 3 more chances.");
            }
            else if (GreaterthanorLess3<random_number)
            {
                System.out.println("my number is greater than your number, you have 3 more chances");
            }
            else
            {
                System.out.println("Wow! You have already guessed my number, good job!");
            }
            int GreaterthanorLess4 = input.nextInt();//                                                                GreaterthanorLess4
            if (GreaterthanorLess4>random_number)
            {
                System.out.println("your number is greater than my number, you have 2 more chances.");
            }
            else if (GreaterthanorLess4<random_number)
            {
                System.out.println("my number is greater than your number, you have 2 more chances");
            }
            else
            {
                System.out.println("Wow! You have already guessed my number, good job!");
            }
            int GreaterthanorLess5 = input.nextInt();
            if (GreaterthanorLess5>random_number)
            {
                System.out.println("your number is greater than my number, you have 1 more chances.");
            }
            else if (GreaterthanorLess5<random_number)
            {
                System.out.println("my number is greater than your number, you have 1 more chances");
            }
            else
            {
                System.out.println("Wow! You have already guessed my number, good job!");
            }
            int Greaterthanorless5 = input.nextInt();
            if (Greaterthanorless5 != random_number)
            {
                System.out.println("sadly, you were not able to guess correctly. The number I thought of was " + random_number + "Try again.");
            }
            else if (Greaterthanorless5 == random_number)
            {
                System.out.println("Wow, you got the number on the last try, good job!");
            }
            
        }
        else if (answer.equals("no"))
        {
            System.out.println("Have a nice day.");
        }
        else 
        {
            System.out.println("Please print 'yes' or 'no'");
        }

    }
}