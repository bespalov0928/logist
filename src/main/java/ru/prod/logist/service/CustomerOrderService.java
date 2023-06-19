package ru.prod.logist.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.prod.logist.model.CustomerOrder;
import ru.prod.logist.repository.CustomerOrderRepository;

@Service
@AllArgsConstructor
public class CustomerOrderService {
    private final CustomerOrderRepository customerOrderRepository;

    public void create(CustomerOrder customerOrder){
        customerOrderRepository.save(customerOrder);
    }
}
