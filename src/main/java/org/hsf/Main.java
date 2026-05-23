package org.hsf;

import org.hsf.dao.DepartmentDao;
import org.hsf.dao.DepartmentDaoImpl;
import org.hsf.entities.Department;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentName("SE");
        department.setDescription("Software Engineering");

        DepartmentDao departmentDao = new DepartmentDaoImpl();
        Department result = departmentDao.createDepartment(department);
        System.out.println(result);

        departmentDao.findAll().forEach(System.out::println);
    }
}