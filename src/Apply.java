import java.util.Scanner;

//user can apply for an apartment and get an approval based
// on their income, request maintenance
public class Apply {
    public static void main(String[] args) {
        //new instane of manage application
        ManageApplications manager = new ManageApplications();

        Scanner scan = new Scanner(System.in);

        String loopAnswer = "y";

        System.out.println("Welcome to Malibu Estates.\n" +
                "What would you like to do today?\n" +
                "1.Apply for an apartment\n" +
                "2.View your past applications\n" +
                "3.Update an application\n" +
                "4.Withdraw an application\n" +
                "5.Maintenance Request");
        int input = scan.nextInt();

        if (input == 1) {
            while (loopAnswer.equals("y")) {
                System.out.println("Would you like live at our luxurious beach side condos?\n" +
                        "Here is our requirements to be approved:\n" +
                        "Must a credit score over 700 and income must be 3x the rent.\n" +
                        "Sound like you apply today");
                Tenants tenants = new Tenants();
                System.out.println("What is your first name?");
                String fName = scan.nextLine();
                tenants.setFname(fName);
                System.out.println("What is your last name?");
                String lName = scan.nextLine();
                tenants.setFname(lName);
                System.out.println("What is your credit score?");
                int credit = scan.nextInt();
                tenants.setCreditScore(credit);
                System.out.println("What is your monthly income");
                int income = scan.nextInt();
                tenants.setIncome(income);

                manager.create(tenants);
                System.out.println("Would you like to apply for another unit?");
                loopAnswer = scan.nextLine();
            } 
        } else if (input == 2) {
            System.out.println("What is your first name?");
            int searchName = scan.nextInt();
            System.out.println(manager.read(searchName).toString());
        } else if (input == 3) {
            System.out.println("How much is your new income?");
            int uppdateIncome = scan.nextInt();
            manager.update(uppdateIncome);
        } else if (input == 4) {

            
        } else if (input == 5) {
            
        }
    }
}
