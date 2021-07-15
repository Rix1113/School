package model;

import javax.persistence.*;

@Entity
public class EmployeeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeProjectId;

    @Column(name = "employee_id", length = 10)
    private int employeeId;

    @Column(name = "project_id", length = 10)
    private int projectId;

    public int getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "EmployeeProject{" +
                "employeeProjectId=" + employeeProjectId +
                ", employeeId=" + employeeId +
                ", projectId=" + projectId +
                '}';
    }
}
