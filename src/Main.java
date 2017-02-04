import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userInput;
        int remainder;
        int reverse = 0;


        System.out.println("Please enter numbers to be reversed. ");

        Scanner scan = new Scanner(System.in);
        userInput = scan.nextInt();


                //168
        while (userInput != 0) {                    //168      //16     //10        //0 -terminate loop
            remainder = userInput % 10;             //8        //6      //1
            reverse = reverse * 10 + remainder;     //8        //86     //861
            userInput = userInput / 10;             //16       //10     //0
        }

        System.out.println("The numbers reversed as: " + reverse);


    }
}
