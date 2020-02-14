package controller;

import dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ListController {

    @RequestMapping("/readList")
    public ModelAndView sendObject() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayList");

        Employee employee1 = new Employee();
        employee1.setId(5);
        employee1.setName("Bob");
        employee1.setSalary(100);

        Employee employee2 = new Employee();
        employee2.setId(25);
        employee2.setName("Tom");
        employee2.setSalary(1050);

        Employee employee3= new Employee();
        employee3.setId(55);
        employee3.setName("Sam");
        employee3.setSalary(1800);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        modelAndView.addObject( "employees", employees);
        return modelAndView;
    }
}
