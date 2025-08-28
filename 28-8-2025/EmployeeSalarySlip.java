package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Size input
        System.out.println("Enter number of Employees: ");
        int size=sc.nextInt();

        // Initialize
        String[] names=new String[size];
        int[] basicSalary=new int[size];

        sc.nextLine();
        System.out.println("Enter The names: ");
        for(int i=0;i<=size-1;i++){
            names[i]=sc.nextLine();
        }

        System.out.println("Enter the salary: ");
        basicSalary=arrayInput(size, basicSalary);

        int[] netSalary=new int[size];
        for(int i=0;i<size;i++){
            netSalary[i]=(int)(basicSalary[i]+(basicSalary[i]*.2)+(netSalary[i]*.1));
            if(netSalary[i]>50000){
                netSalary[i]=(int)(netSalary[i]*.9);
            }
        }
        System.out.println("Net Salary is: ");
        for(int i=0;i<size;i++){
            System.out.println(names[i]+" has a net salary of "+netSalary[i]);
        }
        sc.close();
    }

    public static int[] arrayInput(int size,int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    } 
}
