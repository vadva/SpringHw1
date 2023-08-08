package app.controller;

import app.dao.CustomerDao;
import app.entity.Customer;
import app.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final List<Customer> customers= List.of(
            new Customer("Vadym","vad@gmail.com",41),
            new Customer("Ira","ira@gmail.com",31),
            new Customer("Sveta","sveta@gmail.com",21)
    );
    @PostMapping("customer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @GetMapping("customerToDelete")
    public boolean delete(@RequestBody Customer obj) {
        customerService.delete(obj);
        return true;
    }
    @GetMapping("customersToDelete")
    public void deleteAll(List<Customer> entities) {
        customerService.deleteAll(entities);
    }
    @GetMapping("customers")
    public void saveAll(List<Customer> entities) {
        customerService.saveAll(entities);
    }

    @GetMapping()
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("customerToDelete/{id}")
    public boolean deleteById(long id) {
        return false;
    }

    @GetMapping("customer/{id}")
    public Customer getById(@PathVariable("id") long id) {
        return customerService.getById(id);
    }

}
