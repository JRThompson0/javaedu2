package cohort15;
import java.util.Scanner;
class BobOrAlice {
    public static void main(String[] args) {
        System.out.println("Bob, or Alice?");
        Scanner textScan = new Scanner(System.in);
        String userName = textScan.nextLine();
        boolean loggin = false;

        while (!loggin)
        {
            if (userName.equals("Bob") | userName.equals("Alice"))
            {
                System.out.println("Welcome, " + userName + "!");
                loggin = true;
            }
            else
            {
                System.out.println("Wrong answer. Let's try again. Bob or Alice?");
                userName = textScan.nextLine();
            }
        }
    }
}