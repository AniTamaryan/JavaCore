package homeworks.Employee;

import homeworks.Library.Book;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee){
        if (size == employees.length){
            extend();
        }
        employees[size++] =  employee;

    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees,0, tmp,0,size );
        employees = tmp;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println(employees[i]);
        }
    }

    public void searchByID(String keyword) {
        boolean isFound = false;
        for (int i = 0; i < size; i++){
            if(employees[i].getEmployeeID().toLowerCase().contains(keyword)){
                System.out.println(employees[i]);
                isFound = true;
            }
        }
        if(!isFound) {
            System.out.println("No employee found with ID containing: ");
        }
    }

    public void searchByCompany(String keyword) {
        for (int i = 0; i < size; i++){
            if(employees[i].getCompany().toLowerCase().contains(keyword)){
                System.out.println(employees[i]);
            }
        }
    }
}
