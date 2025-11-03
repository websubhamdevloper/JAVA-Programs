package Projects;

import java.util.*;

public class KBC {
    public static int points = 0;

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Welcome to KBC India");
        String name, registrationID;
        System.out.print("Enter your Name: ");
        name = scanf.nextLine();
        System.out.print("Enter your Registration ID : ");
        registrationID = scanf.nextLine();
        String[] regisId = {"subham2004", "viraj4002", "sayan0092", "sudeshna2004"};

        boolean found = false;

        for (String r : regisId) {
            if (r.equals(registrationID)) {
                found = true;
                break;
            }
        }
        if (found) {
            contest();
        } else {
            System.out.println("Invalid Registration ID..!");
        }
        scanf.close();
    }

    public static void contest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your current point is " + points);
        System.out.println("Contest Starting...");
        System.out.println("Q1. Who is the founder of JAVA programming language: ");
        String ans1 = scanner.nextLine();
        switch (ans1) {
            case "james gosling":
                System.out.println("Correct Answer!");
                points++;
                System.out.println("Your current points : " + points);
                break;
            default:
                if (points != 0) {
                    points--;
                }

        }
        System.out.println("Q2. Who is the founder of FaceBook: ");
        String ans2 = scanner.nextLine();
        if (Objects.equals(ans2, "mark zuckerberg")) {
            System.out.println("Correct Answer!");
            points++;
            System.out.println("Your current points : " + points);
        } else {
            if (points != 0) {
                points--;
            }

        }
        System.out.println("Q3. Who is the founder of Tesla (Only one name): ");
        String ans3 = scanner.nextLine();
        if (Objects.equals(ans3, "elon musk") || Objects.equals(ans3, "martin eberhard") || Objects.equals(ans3, "marc tarpenning")) {
            System.out.println("Correct Answer!");
            points++;
            System.out.println("Your current points : " + points);
        } else {
            if (points != 0) {
                points--;

            }

        }
        if (points != 0) {
            System.out.println("Your points are : " + points);
            if (points == 3){
                System.out.println("You won $4000");
            } else if (points == 2) {
                System.out.println("You won $2500");
            } else {
                System.out.println("You won $1000");
            }
        } else {
            System.out.println("You have 0 points...");
            System.out.println("Better luck next time...");
        }

    }
}
