package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentNumber;
    private String departmentName;
    @OneToMany
    private Employee departmentManager;


    public Department() {
    }


    public Department(String departmentName, Employee departmentManager) {
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
    }


    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }
}
