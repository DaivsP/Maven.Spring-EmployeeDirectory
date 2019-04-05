package io.zipcoder.persistenceapp.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void setFirstNameTest() {
        Employee employee = new Employee();

        employee.setFirstName("Davis");

        Assert.assertEquals("Davis", employee.getFirstName());
    }

    @Test
    public void setLastName() {
        Employee employee = new Employee();

        employee.setLastName("Perchik");

        Assert.assertEquals("Perchik", employee.getLastName());
    }

    @Test
    public void setTitle() {
        Employee employee = new Employee();

        employee.setTitle("Boss");

        Assert.assertEquals("Boss", employee.getTitle());
    }

    @Test
    public void setPhoneNumber() {
        Employee employee = new Employee();

        employee.setPhoneNumber("123-123-1234");

        Assert.assertEquals("123-123-1234", employee.getPhoneNumber());
    }

    @Test
    public void setEmail() {
        Employee employee = new Employee();

        employee.setEmail("davis@gmail.com");

        Assert.assertEquals("davis@gmail.com", employee.getEmail());
    }

    @Test
    public void setHireDate() {
        Employee employee = new Employee();

        employee.setHireDate("1/2/00");

        Assert.assertEquals("1/2/00", employee.getHireDate());
    }

    @Test
    public void setManager() {
        Employee employee = new Employee();
        Employee manager = new Employee();

        employee.setManager(manager);

        Assert.assertEquals(manager, employee.getManager());
    }

    @Test
    public void setDepartmentNumber() {
    }
}