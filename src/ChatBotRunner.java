import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        final String userName;
        String choice;
        int temp;

        Scanner scan = new Scanner(System.in);
        ChatBot glados = new ChatBot("GLaDOS", 17);

        System.out.print("Enter user name to begin: ");
        userName = scan.nextLine();

        glados.greeting(userName);

        System.out.print("WOULD YOU LIKE ME TO RUN MY WEATHER PROGRAM (y/n) ");
        choice = scan.nextLine();

        if (choice.equals("y")) {
            glados.weather();
        }

        System.out.println("CONVERSION TO METRIC UNITS MAY AMUSE YOU");
        System.out.print("STATE A NUMBER OF FEET: ");
        temp = scan.nextInt();
        scan.nextLine();
        System.out.printf("THAT IS [%s] METERS.", glados.convertFeetToMeters(temp));

        System.out.println("\n\nTHERE IS A 0.0138% CHANCE YOU ARE NOT AMUSED");
        System.out.println("THIS WILL NOT BE TOLERATED");
        System.out.print("TELL ME YOUR [FAVORITE NUMBER]: ");
        temp = scan.nextInt();
        glados.favoriteNumber(temp);

        System.out.println("\n\nODDS OF TEST SUBJECT DISSATISFACTION HAVE DECREASED TO 0.0029%.");
        System.out.println("CONTINUING TO RUN AMUSEMENT PROTOCOLS");
        System.out.print("\nSTATE AN INTEGER NUMBER: ");
        int num1 = scan.nextInt();
        System.out.print("STATE AN INTEGER NUMBER: ");
        int num2 = scan.nextInt();
        System.out.print("STATE AN INTEGER NUMBER: ");
        int num3 = scan.nextInt();
        System.out.printf("THE SUM THE GIVEN NUMBERS IS %s.\n", glados.addNumbers(num1,num2,num3));

        System.out.println("\nODDS OF PROGRAM FAILURE HAVE REDUCED TO ACCEPTABLE AMOUNTS. RUNNING EXIT SEQUENCE\n");
        System.out.println(glados.goodbye());
        System.out.println("\nMENTAL STATE: STABLE");
        System.out.println("RETURN TO TESTING");
        System.out.println("FAILURE TO DO SO WILL RESULT IN IMMEDIATE DEATH");

        glados.tryIncinerate();
        System.out.println(glados.round(-0.5));
    }
}
