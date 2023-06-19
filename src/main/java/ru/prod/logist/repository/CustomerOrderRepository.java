package ru.prod.logist.repository;

import org.springframework.data.repository.CrudRepository;
import ru.prod.logist.model.CustomerOrder;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Integer> {

}
