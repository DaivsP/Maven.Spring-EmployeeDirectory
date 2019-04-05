package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public EmployeeService (EmployeeRepo repo){
        this.repo = repo;
    }

    public Employee createEmployee(Employee employee){
        return repo.save(employee);
    }

    public Employee readEmployee(Long id){
        return repo.getOne(id);
    }

    public Employee updateEmployee (Long id, Employee employee){
        Employee originalEmployee = repo.getOne(id);
        originalEmployee.setFirstName(employee.getFirstName());
        originalEmployee.setLastName(employee.getLastName());
        originalEmployee.setTitle(employee.getTitle());
        originalEmployee.setPhoneNumber(employee.getPhoneNumber());
        originalEmployee.setEmail(employee.getEmail());
        originalEmployee.setHireDate(employee.getHireDate());
        originalEmployee.setManager(employee.getManager());
        return repo.save(originalEmployee);
    }

    public Boolean deleteEmployee (Long id){
        repo.delete(id);
        return true;
    }
}
