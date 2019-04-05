package io.zipcoder.persistenceapp.services;

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
}
