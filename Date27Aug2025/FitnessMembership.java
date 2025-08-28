package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class FitnessMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean centerOpen = true; 

        
        while (centerOpen) {
            
            int members;
            do {
                System.out.print("Enter number of members to register (at least 1): ");
                members = sc.nextInt();
            } while (members < 1);

            
            for (int i = 1; i <= members; i++) {
                System.out.println("\nRegistering member #" + i);

                // Switch-case: membership type
                System.out.println("Select Membership Type: ");
                System.out.println("1. Monthly - Rs. 1000");
                System.out.println("2. Quarterly - Rs. 2500");
                System.out.println("3. Yearly - Rs. 9000");
                int choice = sc.nextInt();

                int fee = 0;
                switch (choice) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2500;
                        break;
                    case 3:
                        fee = 9000;
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 1000;
                }

                
                System.out.print("Is the member a Student or Senior Citizen? (yes/no): ");
                String discountInput = sc.next();
                if (discountInput.equalsIgnoreCase("yes")) {
                    fee = (int) (fee * 0.8);
                    System.out.println("Discount applied! New fee: Rs. " + fee);
                } else {
                    System.out.println("No discount applied. Fee: Rs. " + fee);
                }

                System.out.println("Member #" + i + " registered successfully. Final Fee: Rs. " + fee);
            }

            
            System.out.print("\nDo you want to register more members? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                centerOpen = false;
                System.out.println("Center closed.");
            }
        }

        sc.close();
    }
}
