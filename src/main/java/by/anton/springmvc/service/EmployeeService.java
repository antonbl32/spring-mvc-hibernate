package by.anton.springmvc.service;

import by.anton.springmvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
//    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployeeById(int id);
}
