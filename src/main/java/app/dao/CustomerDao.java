package app.dao;

import app.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class CustomerDao implements CustomerDaoInt<Customer> {
    private long id=0;
    private final List<Customer> customers;

    @Override
    public Customer save(Customer obj) {
        id++;
        obj.setId(id);
        customers.add(obj);
        return customers.get(customers.size());
    }

    @Override
    public boolean delete(Customer obj) {
        return false;
    }

    @Override
    public void deleteAll(List<Customer> entities) {

    }

    @Override
    public void saveAll(List<Customer> entities) {

    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Customer getOne(long id) {
        return customers.get((int)id-1);
    }
}
