package ru.prod.logist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.prod.logist.service.CustomerOrderService;

@Controller
public class IndexController {
    private final CustomerOrderService customerOrderService;

    public IndexController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }
}
