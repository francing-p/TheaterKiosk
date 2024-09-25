import java.util.Scanner; // import Scanner

public class theater {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // create new instance of Scanner
        int age=0;  // define variables

        System.out.print("What is your age? ");
        if (in.hasNextInt()){ // checks to make sure integer was input
            age=in.nextInt(); // grabs user input
            in.nextLine(); // clear buffer
            if (age>=21){ // gives wristband if 21 or older
                System.out.println("You get a wristband! ");
            }
            // no else statement after because nothing is done if user is under 21
        }
        else{ // responds if input was not an integer
            System.out.println("Invalid input. Must be an integer");
            in.nextLine(); // ignores user input and program ends
        }
    }
}
