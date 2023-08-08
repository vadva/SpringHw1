package app.service;

import app.dao.CustomerDao;
import app.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerDao customerDao;

    public Customer save(Customer obj) {
        return customerDao.save(obj);
    }


    public boolean delete(Customer obj) {
        return false;
    }


    public void deleteAll(List<Customer> entities) {

    }


    public void saveAll(List<Customer> entities) {

    }


    public List<Customer> findAll() {
        return customerDao.findAll();
    }


    public boolean deleteById(long id) {
        return false;
    }


    public Customer getById(long id) {
        return customerDao.getOne(id);
    }

}
