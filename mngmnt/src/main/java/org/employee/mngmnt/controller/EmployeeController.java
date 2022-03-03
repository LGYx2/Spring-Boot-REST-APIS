package org.employee.mngmnt.controller;

import org.employee.mngmnt.model.Employee;
import org.employee.mngmnt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository eRepo;

    @GetMapping({"/showEmployees","/","/list"})
    public ModelAndView showAllEmployees(){
        ModelAndView mav = new ModelAndView("list-employees");
        List<Employee> list = eRepo.findAll();
        mav.addObject("employees",list);
        return mav;
    }
    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm(){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        mav.addObject("employee",newEmployee);
        return mav;
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee){
        eRepo.save(employee);
        return "redirect:/";
    }
    @GetMapping("/editEmployee/{id}")
    public ModelAndView editEmployeeForm(@PathVariable long id){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee updateEmployee= eRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid user id:"+id));
        mav.addObject("employee",updateEmployee);
        return mav;
    }
//    @PostMapping("/updateEmployee/{id}")
//    public String updateEmployee(@PathVariable long id,@ModelAttribute Employee employee){
//        eRepo.save(employee);
//        return "redirect:/";
//    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable long id,@ModelAttribute Employee employee){
        eRepo.delete(employee);
        return "redirect:/";
    }
}
