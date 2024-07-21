import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three numbers between: (1 - 6)    ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        if (isNumLessThan1(num1, num2, num3) || isNumGreaterThan6(num1, num2, num3)) {
            System.out.println("\nInvalid input: Your numbers need to be within 1 - 6");
            System.exit(0);
        }

        int userNumTotal = num1 + num2 + num3;

        System.out.println("Your total is: " + userNumTotal);

        int pcNum1 = roll();
        int pcNum2 = roll();
        int pcNum3 = roll();

        int pcNumTotal = pcNum1 + pcNum2 + pcNum3;
    
        System.out.println("PC total is: " + pcNumTotal);
    
        if (youWin(userNumTotal, pcNumTotal)) {
            System.out.println("Congratulations You WIN!");
            
        } else {
            System.out.println("Better luck next time! Try again!");
        }
    
    }
    
    /**
     * Function name: roll
     * 
     * Inside the function:
     *  1. generates a random number betweeen 1 and 6 (inclusive) using the Math.random method 
     *     and returns this double to an integer.
     * 
     * @return An integer between 1 and 6 (inclusive), representing the outcome of the die roll.
     */

    public static int roll() {
            double x = Math.random() * 6 + 1;
            return (int) x;
    }


    /**
     * Function name: isNumLessThan1
     * 
     * Inside the function:
     *  1. This method evaluates wheather at least one of the input integers {@code num1}, 
     *     {@code num2}, or {@code num3} is less than 1. 
     *     It returns {@code true} if at least one of the integers is less than 1, otherwise {@code false}
     *     
     * @param num1 (Integer) The first integer to check.
     * @param num2 (Integer) The second integer to check.
     * @param num3 (Integer) The third integer to check.
     * @return {@code true} if at least one of {@code num1}. {@code num2}, or {@code num3} is less than 1;
     *         {@code false} otherwise
     */

    public static boolean isNumLessThan1(int num1, int num2, int num3) {
        if (num1 < 1 || num2 < 1 || num3 < 1) {
            return true;
        }
        return false;
    }


    /**
     * Function name: isNumGreaterThan6 
     * 
     * 1. This function evaluates wheather at least one of the input integers {@code num1}, 
     *     {@code num2}, or {@code num3} is greater than 6. 
     *     It returns {@code true} if at least one of the integers is greater than 6, otherwise {@code false}
     * 
     * @param num1 (Integer) The first integer to check.
     * @param num2 (Integer) The second integer to check.
     * @param num3 (Integer) The third integer to check.
     * @return {@code true} if at least one of {@code num1}. {@code num2}, or {@code num3} is greater than 6;
     *         {@code false} otherwise
     */
    public static boolean isNumGreaterThan6(int num1, int num2, int num3) {
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            return true;
        }
        return false;

    }

    /**
     * Function name: youwin
     * 
     * 1. This function checks if {@code userNumTotal} is greater than {@code pcNumTotal} and if the difference between
     *    {@code userNumTotal} and {@code pcNumTotal} is greater than 5. If both conditions are met, the function returns
     *    {@code true}. Otherwise, it returns {@code false}
     * 
     * @param userNumTotal (Integer) total number of user rolls added together
     * @param pcNumTotal   (Integer) total number of PC rolls added together
     * @return {@code true} if {@code userNumTotal} is greater than {@code pcNumTotal} and the difference between them is
     *         greater than 5; {@code false} otherwise.
     */
    public static boolean youWin(int userNumTotal, int pcNumTotal) {
        return (userNumTotal > pcNumTotal && (userNumTotal - pcNumTotal) > 5);
    }
}

