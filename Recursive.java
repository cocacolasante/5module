import java.util.Scanner;

public class Recursive {
    public static int multiplyNumbers(int[] numbers, int index){
        if(index == numbers.length -1){
            return numbers[index];
        }

        return numbers[index] * multiplyNumbers(numbers, index + 1);
    }

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int[] inputNumbers = new int[5];

        System.out.println("Please enter 5 integers");

        for(int i = 0; i < inputNumbers.length; i++){
            System.out.println("Number " + (i+1)+":");
            inputNumbers[i] = inputScanner.nextInt();
        }

        int total = multiplyNumbers(inputNumbers, 0);

        System.out.println("Total is: " + total);

        inputScanner.close();
    }
}