package main;

import javafx.scene.transform.Scale;
import menu.Menu;
import model.Employee;
import persistence.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.switchChoice();
    }
}



        /*
        Sisestused ja tabeli tegemine
         */
//        RepositoryEmployee rep = new RepositoryEmployee();
//        Employee employee = new Employee();

//        employee.setDepartment_id(1);
//        employee.setFirstName("Juhan");
//        employee.setLastName("Liiv");
//        employee.setEmail("Juhan@mail.com");
//        employee.setPhoneNumber("5354575");
//        employee.setDateOfBirth("1960-06-21");
//        employee.setSalary(1573);
//
//        rep.saveEmployee(employee);




        /*
        find employee by ID
       */
        //System.out.println(rep.findEmployeeById(2));

        /*
        deleteEmployee
         */
//        employee.setEmployeeId(9);
//        rep.deleteEmployee(employee);

        /*
        List all employees
         */
//        List<Employee> listResult = (List<Employee>) rep.listAllEmployees();
//        for (Employee emp : listResult)
//            System.out.println(emp.toString());


        /*
        Find employee by department
         */
//        List<Employee> listResult = (List<Employee>) rep.listEmployeeByDepartment(1);
//        for (Employee emp : listResult)
//            System.out.println(emp.toString());


        /*
        Update employee
         */
//        employee.setEmployeeId(4);
//        employee.setFirstName("Rix");
//        employee.setLastName("Kiintok");
//        rep.updateEmployee(employee);
//    }
//}
