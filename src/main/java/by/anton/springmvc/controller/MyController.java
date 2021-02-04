package by.anton.springmvc.controller;

import by.anton.springmvc.dao.EmployeeDAO;
import by.anton.springmvc.entity.Employee;
import by.anton.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
     return "emp-info";
    }
    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
        Employee employee=employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);


        return "emp-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId")int id){
        employeeService.deleteEmployee(employeeService.getEmployeeById(id));
        return "redirect:/";
    }

}
