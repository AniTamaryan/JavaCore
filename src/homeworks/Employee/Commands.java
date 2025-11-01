package homeworks.Employee;

public interface Commands {
    String  EXIT = "0";
    String  ADD_EMPLOYEE = "1";
    String  PRINT_ALL_EMPLOYEES = "2";
    String  SEARCH_EMPLOYEE_BY_ID = "3";
    String  SEARCH_EMPLOYEE_BY_COMPANY = "4";


    static void printCommands(){
        System.out.println("please input " + EXIT + " for EXIT: ");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add Employee: ");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for Print all employees: ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for search employee be ID: ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for search employee by Company: ");
    }
}
