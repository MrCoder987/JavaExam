package com.crimsonlogic.util;

import java.util.Scanner;

public class EmployeeCarManager {
    Scanner sc = new Scanner(System.in);
    char ch = 'y';
    EmployeeCarOperations eco = new EmployeeCarOperations();
    public void employeeOptions() {
        while (ch == 'y') {
            System.out.println("createEmp: Create a new employee entry: ");
            System.out.println("carInfo: Check and set employee car info: ");
            System.out.println("exit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "createEmp":
                    System.out.println("Creating a new employee entry...");
                    eco.createEmployee();
                    break;

                case "carInfo":
                    carOptions();
                    break;

                case "exit":
                    System.out.println("Exiting the system...");
                    return;
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        }

    }

    public void carOptions() {
        while (ch == 'y') {
            System.out.println("store: Store car info allotted to employee");
            System.out.println("display: Display car details for an employee");
            System.out.println("displayAll: Display all car details allotted to different employees");
            System.out.println("displayModel: Display car model allotted to an employee");
            System.out.println("eligibility: Check if an employee is eligible to avail car services\n");
            System.out.println("Enter your choice: ");

            String choice = sc.nextLine();

            int eId = 0;
            switch (choice) {
                case "store":
                    System.out.println("Enter employee ID: ");
                    eId = sc.nextInt();
                    eco.storeCarDetails(eId);
                    break;

                case "display":
                    System.out.println("Enter employee ID: ");
                    eId = sc.nextInt();
                    eco.displayCarDetails(eId);
                    break;

                case "displayAll":
                    eco.displayAllEmployeeCars();
                    break;

                case "displayModel":
                    System.out.println("Enter employee ID: ");
                    eId = sc.nextInt();
                    eco.displayModel(eId);
                    break;

                case "eligibility":
                    System.out.println("Enter employee ID: ");
                    eId = sc.nextInt();
                    eco.checkEligibility(eId);
                    break;

                case "exit":
                    System.out.println("Exiting the system...");
                    return;
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        }
    }
}
