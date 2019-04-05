package io.zipcoder.persistenceapp.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void setDepartmentNameTest() {
        Department department = new Department();

        department.setDepartmentName("Strings");

        Assert.assertEquals("Strings", department.getDepartmentName());
    }

    @Test
    public void setDepartmentManagerTest() {
        Department department = new Department();
        Employee manager = new Employee();

        department.setDepartmentManager(manager);

        Assert.assertEquals(manager, department.getDepartmentManager());
    }
}