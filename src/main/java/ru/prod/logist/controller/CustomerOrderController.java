package ru.prod.logist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.prod.logist.model.CustomerOrder;
import ru.prod.logist.repository.CustomerOrderRepository;

@RestController
@RequestMapping("/customerOrder")
public class CustomerOrderController {
    private final CustomerOrderRepository customerOrderRepository;

    public CustomerOrderController(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    @PostMapping("/")
    public ResponseEntity<CustomerOrder> create(@RequestBody CustomerOrder customerOrder) {
        ResponseEntity<CustomerOrder> responseEntity = new ResponseEntity<CustomerOrder>(
                this.customerOrderRepository.save(customerOrder),
                HttpStatus.CREATED);
        return responseEntity;
    }
}
