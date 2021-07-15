package persistence;

import model.Employee;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee {

    private final EntityManager entityManager;


    public RepositoryEmployee() {
        entityManager = DBUtil.getEntityManagerMy();
    }

    public void saveEmployee(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            System.out.println("Employee saved with success");
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            System.out.println("Employee not saved");
        }

    }

    public void updateEmployee(Employee employee) {
            try {
                entityManager.getTransaction().begin();
                Employee employee1 = entityManager.find(Employee.class, employee.getEmployeeId());
                employee1.setLastName("Kiintok");
                entityManager.merge(employee1);
                entityManager.getTransaction().commit();
                System.out.println("Employee updated");
            } catch (Exception e) {
                e.printStackTrace();
                entityManager.getTransaction().rollback();
            }

    }

    public void deleteEmployee(Employee employee) {
        try {
            entityManager.getTransaction().begin();
            employee = entityManager.find(Employee.class, new Integer(employee.getEmployeeId()));
            entityManager.remove(employee);
            entityManager.getTransaction().commit();
            System.out.println("Deleting " + employee.getFirstName() + " complete");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Deleting canceled");
        }

    }

    public List<?> listAllEmployees() {
        List<?> employee = new ArrayList<>();
        try {
            entityManager.getTransaction().begin();
            employee = entityManager.createQuery("FROM Employee ")
                    .getResultList();
            System.out.println("Employee list complete");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Can`t create employee list");
        }
        return employee;
    }

    public Employee findEmployeeById(int employeeId) {
        try {
            Employee employee1 = entityManager.find(Employee.class, employeeId);
            entityManager.detach(employee1);
            System.out.println("Employee search complete");
            return employee1;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("Employee by ID not found");
        }
        return null;
    }

    public List<Employee> listEmployeeByDepartment(int departmentId) {
        String sql = "FROM Employee WHERE department_id = " + departmentId;
        entityManager.getTransaction().begin();
        List<?> employee = entityManager.createQuery(sql)
                .getResultList();
        return (List<Employee>) employee;
    }

    //public List<EmployeeDepartment> listEmp()
}
