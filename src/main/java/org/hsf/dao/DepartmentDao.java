package org.hsf.dao;

import org.hsf.entities.Department;

import java.util.List;

public interface DepartmentDao {
    List<Department> findAll();

    Department createDepartment(Department dept);
}