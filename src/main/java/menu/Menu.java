package menu;

import model.Employee;
import persistence.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;

public class Menu {
        RepositoryEmployee rep = new RepositoryEmployee();
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

    public void menuList() {
        System.out.println("________________________________");
        System.out.println("|    Welcome to my program     |");
        System.out.printf("%22s\n", "Make your choice");
        System.out.println("********************************");
        System.out.println("1. Insert new employee");
        System.out.println("2. Modify employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Find employee by ID");
        System.out.println("5. List employee by department");
        System.out.println("6. List all employees");
        System.out.println("7. Exit\n");
        System.out.print("Your choice: ");
    }

    public void switchChoice() {
        Menu menu = new Menu();
        menu.menuList();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                menu.addNewEmployee();
                break;
            case 2:
                menu.updateEmployee();
                break;
            case 3:
                menu.deleteEmployee();
                break;
            case 4:
                menu.findEmployeeById();
                break;
            case 5:
                menu.listEmployeeByDepartment();
                break;
            case 6:
                menu.listAllEmployees();
                break;
            case 7:
                System.exit(0);
        }
    }

    public void addNewEmployee() {
        //Hiljem lisada milline department, v4lja printida listina
        System.out.println("Select department: ");
        int depId = scanner.nextInt();
        employee.setDepartment_id(depId);

        System.out.println("Enter first name:");
        String firstName = scanner.next();
        employee.setFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        employee.setLastName(lastName);

        System.out.println("Enter email:");
        String email = scanner.next();
        employee.setEmail(email);

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.next();
        employee.setPhoneNumber(phoneNumber);

        System.out.println("Enter day of birth:");
        String dob = scanner.next();
        employee.setDateOfBirth(dob);

        System.out.println("Enter salary:");
        int salary = scanner.nextInt();
        employee.setSalary(salary);

        rep.saveEmployee(employee);
        switchChoice();
    }

    private void updateEmployee() {
        //Siin saab if-else statemendiga muuta, selle peab lisama
        employee.setEmployeeId(4);
        employee.setFirstName("Rix");
        employee.setLastName("Kiintok");
        rep.updateEmployee(employee);
    }

    private void deleteEmployee() {
        System.out.print("Enter employee ID witch one you want delete: ");
        int delete = scanner.nextInt();
        employee.setEmployeeId(delete);
        rep.deleteEmployee(employee);
    }

    private void findEmployeeById() {
        System.out.println("Enter employee ID: ");
        int empId = scanner.nextInt();
        System.out.println(rep.findEmployeeById(empId));
    }

    private void listEmployeeByDepartment() {
        System.out.println("Enter department ID: ");
        int departmentId = scanner.nextInt();
        List<Employee> listResult = (List<Employee>) rep.listEmployeeByDepartment(departmentId);
        for (Employee emp : listResult)
            System.out.println(emp.toString());
    }

    private void listAllEmployees() {
        List<Employee> listResult = (List<Employee>) rep.listAllEmployees();
        for (Employee emp : listResult)
            System.out.println(emp.toString());
    }
}
