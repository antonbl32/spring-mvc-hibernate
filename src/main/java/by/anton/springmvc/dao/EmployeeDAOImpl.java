package by.anton.springmvc.dao;

import by.anton.springmvc.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional //спринг сам контролирует открытие и закрытие транзакции
    public List<Employee> getAllEmployees() {

        Session session=sessionFactory.getCurrentSession();
        List<Employee> allEmploees=session.createQuery("from Employee ", Employee.class).getResultList();
        

        return null;

    }
}
