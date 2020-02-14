package controller;

import dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {

    @RequestMapping("/readObject")
    public ModelAndView sendObject() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayObject");

        Employee employee = new Employee();
        employee.setId(5);
        employee.setName("Bob");
        employee.setSalary(100);

        modelAndView.addObject( "employee", employee);
        return modelAndView;
    }
}
