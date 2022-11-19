import java.util.Scanner;

//user can apply for an apartment and get an approval based
// on their income, request maintenance
public class Apply {
    public static void main(String[] args) {
        //new instane of manage application
        ManageApplications manager = new ManageApplications();

        Scanner scan = new Scanner(System.in);

        String loopAnswer = "y";
        int minIncome = 4000;
        int minScore = 700;
        while (true) {
            System.out.println("Welcome to Malibu Estates.\n" +
                    "What would you like to do today?\n" +
                    "1.Apply for an apartment\n" +
                    "2.View your past applications\n" +
                    "3.Update an application\n" +
                    "4.Withdraw an application\n" +
                    "5.Maintenance Request\n" +
                    "6.See Maintenance Requests");
            int input = scan.nextInt();

            if (input == 1) {
                System.out.println("Would you like live at our luxurious beach side condos?\n" +
                        "Here is our requirements to be approved:\n" +
                        "Must a credit score over 700 and income must be 3x the rent.\n" +
                        "Sound like you apply today!");
                Tenants tenants = new Tenants();
                System.out.println("What is your first name?");
                Scanner scans = new Scanner(System.in);
                String fName = scans.nextLine();
                tenants.setFname(fName);
                System.out.println("What is your last name?");
                String lName = scans.nextLine();
                tenants.setFname(lName);
                System.out.println("What is your credit score?");
                int credit = scan.nextInt();
                tenants.setCreditScore(credit);
                System.out.println("What is your monthly income");
                int income = scan.nextInt();
                tenants.setIncome(income);

                manager.create(tenants);
                if (income >= minIncome && credit >= minScore) {
                    System.out.println("You are approved for this unit!");
                } else {
                    System.out.println("Sorry, you don't meet the minuim requirements. Try again in the future.");
                }
            } else if (input == 2) {
                System.out.println("What is your first name?");
                Scanner scans = new Scanner(System.in);
                String searchName = scans.nextLine();
                System.out.println(manager.read(searchName));
            } else if (input == 3) {
                System.out.println("How much is your new income?");
                Scanner scans = new Scanner(System.in);
                String updateIncome = scans.nextLine();
                manager.update(updateIncome);
            } else if (input == 4) {
                System.out.println("What is your name?");
                Scanner scans = new Scanner(System.in);
                String deleteApplication = scans.nextLine();
                manager.delete(deleteApplication);
            } else if (input == 5) {
                Maintenance requests = new Maintenance();
                System.out.println("What is your unit number?");
                Scanner scans = new Scanner(System.in);
                int unit = scan.nextInt();
                requests.setUnitNumber(unit);
                System.out.println("What is the issue?");
                Scanner scanz = new Scanner(System.in);
                String issue = scanz.nextLine();
                requests.setIssue(issue);
                System.out.println("Any pets inside the unit?");
                Scanner scanx = new Scanner(System.in);
                Boolean pet = scanx.hasNextBoolean();
                requests.setPet(pet);
                System.out.println("We will be out to resolve your issue in 24 hours!");
                manager.createRequest(requests);
            } else if (input == 6) {
                manager.display();
            }
        }
    }
}
