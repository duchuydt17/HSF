package org.hsf.dao;

import org.hsf.entities.Department;
import org.hsf.entities.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {
    private static UserDao userDao;

    @BeforeAll
    static void setup() {
        userDao = new UserDaoImpl();
    }

    @Test
    void findAll() {
    }

    @Test
    void createUser() {
        User user = new User();

        user.setEmail("sth@mail");
        user.setRole("admin");
        user.setPhone("0123123123");
        user.setFullName("Murphy");
        user.setStatus("active");
        user.setPasswordHash("SHA");
        user.setSsoProviderId("vinaphone");

        Department department = new Department();
        department.setId(2L);

        user.setDepartment(department);

        User actualresult = userDao.createUser(user);

        assertEquals(user, actualresult);
    }
}