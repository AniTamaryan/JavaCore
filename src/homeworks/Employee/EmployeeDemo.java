package homeworks.Employee;

import homeworks.Library.Book;

import java.util.Scanner;

public class EmployeeDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("Please enter employee id: ");
                    String id = scanner.nextLine();
                    employeeStorage.searchByID(id);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    System.out.println("Please enter company name: ");
                    String name = scanner.nextLine();
                    employeeStorage.searchByCompany(name);
                    break;
                default:
                    System.err.println("Wrong command: ");
            }
        }
    }

    private static void addEmployee(){
        System.out.println("Please input employee name: ");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname: ");
        String surname = scanner.nextLine();
        double salary = 0;
        try {
            System.out.println("Please input employee salary: ");
            salary = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Invalid salary. Please enter a number.");
            return;
        }
        System.out.println("Please input employee ID: ");
        String employeeID = scanner.nextLine();
        System.out.println("Please input company name: ");
        String company = scanner.nextLine();
        System.out.println("Please input employee position: ");
        String position = scanner.nextLine();


        Employee employee =  new Employee(name, surname, employeeID, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee added successfuly ");
    }
}
