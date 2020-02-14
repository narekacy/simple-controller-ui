package controller;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/registrationPage")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userReg");
        return modelAndView;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("regResult");
        return modelAndView;
    }

    @RequestMapping(value = "/showData", method = RequestMethod.GET)
    public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
                                 @RequestParam(value = "salary", required = false,
                                         defaultValue = "250") double salary) {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("salary " + salary);
        return new ModelAndView("userReg");
    }



}
