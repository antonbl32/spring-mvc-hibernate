package by.anton.springmvc.controller;

import by.anton.springmvc.dao.EmployeeDAO;
import by.anton.springmvc.entity.Employee;
import by.anton.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired  //поручить Spring самому создать employeeDAO
    private EmployeeService employeeService;

    @RequestMapping("/")
    public  String showAllEmployees(Model model){
        List<Employee> allemployees=employeeService.getAllEmployees();
        model.addAttribute("allEmps", allemployees);
        return "all-employees";
    }


}
