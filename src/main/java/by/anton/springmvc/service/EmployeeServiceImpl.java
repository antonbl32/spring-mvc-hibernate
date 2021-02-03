package by.anton.springmvc.service;

import by.anton.springmvc.dao.EmployeeDAO;
import by.anton.springmvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl  implements  EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional //спринг сам контролирует открытие и закрытие транзакции
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
