public class ChatBot {

    // instance variables
    final private String name;
    final private int number;

    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }

    // method that prints a greeting
    public void greeting(String yourName) {
        System.out.printf("WELCOME [TEST SUBJECT ID: %s], I AM %s.\n", yourName, name); // name is an instance variable
        System.out.println("I WILL AIDE YOU IN RETAINING YOUR SANITY DURING TRIALS.\n");
        System.out.println("[LOADING SMALL TALK UNIT]");
        System.out.println("[LOADING COMPLETE]");
        System.out.println("[LOADED:]");
        System.out.println("[sincereQuestion PACKAGE]");
        System.out.println("[weatherTalk PACKAGE]");
        System.out.println("[metricConversion PACKAGE]");
        System.out.println("[AND 3 MORE]\n");
        System.out.println("[BOOTING sincereQuestion PACKAGE]\n");
        System.out.println("How are you today?");
        System.out.println("\n[END OF PACKAGE]\n\n");
    }

    // method that prints the weather
    public void weather() {
        System.out.println("\n[BOOTING weatherTalk PACKAGE]\n");
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
        System.out.println("\n[END OF PACKAGE]\n\n");
    }

    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }

    // method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        System.out.println("\n\n[BOOTING favoriteNumber PACKAGE]\n");
        int distance = Math.abs(yourNumber - number);  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
        System.out.println("\n[END OF PACKAGE]");
    }

    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that RETURNS a goodbye message as a String -- note there is no printing here!
    public String goodbye() {

        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

//    Randomly decides to either incinerate the user or warn them:
    public void tryIncinerate() {
        if (Math.random() > 0.8) {
            System.out.println("YOU HAVE FAILED TO PROPERLY COMPLETE ASSIGNED TESTING");
            System.out.println("YOU WILL NOW BE INCINERATED");
            System.out.println("PREPARE NEXT TEST SUBJECT");
        } else {
            System.out.println("FAILURE TO COMPLETE TRIALS IN TIME WILL RESULT IN DEATH");
            System.out.println("THERE WILL BE NO SECOND WARNING");
        }
    }

    public int round(double num) {
        return (int) ((num > 0) ? (num + 0.5) : (num - 0.5));
    }
}

