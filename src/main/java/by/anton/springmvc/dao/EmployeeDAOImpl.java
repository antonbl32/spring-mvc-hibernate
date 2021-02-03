package by.anton.springmvc.dao;

import by.anton.springmvc.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository   //для всех классов DAO использовать Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional //спринг сам контролирует открытие и закрытие транзакции
    public List<Employee> getAllEmployees() {

        Session session=sessionFactory.getCurrentSession();
//        List<Employee> allEmploees=session.createQuery("from Employee ", Employee.class).getResultList();
        Query<Employee> query=session.createQuery("from Employee ", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;

    }


    public Employee getEmployeeById(int id) {

        Session session=sessionFactory.getCurrentSession();
//        List<Employee> allEmploees=session.createQuery("from Employee ", Employee.class).getResultList();
        Employee query=session.get(Employee.class,id);

        return query;

    }

}
