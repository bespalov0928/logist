package ru.prod.logist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.prod.logist.model.CustomerOrder;
import ru.prod.logist.repository.CustomerOrderRepository;
import ru.prod.logist.service.CustomerOrderService;

public class Test {
    public static void main(String[] args) {
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setNumber("1");
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//
//        try {
//            SessionFactory sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//            Session session = sf.openSession();
//            session.beginTransaction();
//session.createQuery()
//            session.getTransaction().commit();
//            session.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
