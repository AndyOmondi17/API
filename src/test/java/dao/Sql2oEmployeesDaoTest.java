package dao;

import models.Employees;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.Assert.*;

class Sql2oEmployeesDaoTest {

    @Test
    public void addingCourseSetsId() throws Exception {
        Employees employees = new Employees ("martinGarrix","manager","care-giver","married");
        int originalEmployeeId = employees.getId();
        EmployeesDao.add(employees);
        assertNotEquals(originalEmployeeId, employees.getId()); //how does this work?
    }
    @Test
    public void existingTasksCanBeFoundById() throws Exception {
        Employees employees = new Employees ("martinGarrix","manager","care-giver","married");
        EmployeesDao.add(employees); //add to dao (takes care of saving)
        Employees foundTask = EmployeesDao.findById(Employees.getId()); //retrieve
        assertEquals(employees, foundTask); //should be the same
    }
}