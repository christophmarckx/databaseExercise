package be.cegeka.orders.order.domain.controller;

import be.cegeka.orders.order.domain.customers.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by christom on 23/02/2017.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    void addCustomer (@RequestParam (value = "first name") String firstName,
                      @RequestParam (value="last name") String lastName){
        customerService.addCustomer(firstName, lastName);
    }

}
