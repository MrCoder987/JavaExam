package com.crimsonlogic.util;

import com.crimsonlogic.exception.InvalidEmployeeIDException;
import com.crimsonlogic.exception.InvalidSalaryException;
import com.crimsonlogic.model.Car;
import com.crimsonlogic.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeCarOperations {
    List<Employee> employeeList = new ArrayList<>();
//    List<Car> carList = new ArrayList<>();
    Map<Integer, Car> carMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void createEmployee() {
        Employee e = new Employee();
        try {
            System.out.println("Enter employee ID: ");
            int empId = sc.nextInt();
            e.setEmployeeId(empId);
            if (empId < 0) {
                throw new InvalidEmployeeIDException("Invalid Emp ID. Please enter a valid emp ID.");
            }

            System.out.println("Enter employee first name: ");
            e.setFirstName(sc.next());

            System.out.println("Enter employee last name: ");
            e.setLastName(sc.next());

            System.out.println("Enter employee city: ");
            e.setCity(sc.next());

            System.out.println("Enter employee salary: ");
            double sal = sc.nextDouble();
            e.setSalary(sal);
            if (sal < 0) {
                throw new InvalidSalaryException("Enter a valid salary");
            }
            employeeList.add(e);
        } catch (InvalidEmployeeIDException | InvalidSalaryException excp) {
            excp.getMessage();
        }
    }

    public void storeCarDetails(int empId) {
        Car c = new Car();
        System.out.println("Enter the car ID: ");
        c.setCarId(sc.nextInt());

        System.out.println("Enter the car license number: ");
        c.setLicenseNumber(sc.nextLine());

        System.out.println("Enter the car manufactured year: ");
        c.setYear(sc.nextInt());

        System.out.println("Enter the car maker: ");
        c.setMaker(sc.nextLine());

        System.out.println("Enter the car model: ");
        c.setModel(sc.nextLine());

        carMap.put(empId, c);
    }

    public void displayCarDetails(int empId) {
        System.out.println("Car details associated with employee ID " + empId + ": ");
        System.out.println(carMap.get(empId));
    }

    public void displayAllEmployeeCars() {
        for (Car c: carMap.values()) {
            System.out.println(c);
        }
    }

    public void displayModel(int empId) {
        System.out.println("Car model asociated with employee ID " + empId + ": ");
        System.out.println(carMap.get(empId).getModel());
    }

    public void checkEligibility(int empId) {
        List<Employee> eligibleList = employeeList.stream()
                .filter(e -> e.getSalary() > 100000)
                .collect(Collectors.toList());

        for (int i=0; i<eligibleList.size(); i++) {
            if (eligibleList.get(i).getEmployeeId() == empId) {
                System.out.println("Employee " + empId + " is eligible to avail company car services.");
            }
        }
    }


}
