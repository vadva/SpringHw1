package app.dao;

import app.entity.Account;

import java.util.List;
public class AccountDao implements AccountDaoInt<Account> {

    List<Account> AllAccounts;

    @Override
    public Account save(Account obj) {
        AllAccounts.add(obj);
        return obj;
    }

    @Override
    public boolean delete(Account obj) {
        AllAccounts.stream().filter(e->e!=obj);
        return true;
    }

    @Override
    public void deleteAll(List<Account> entities) {

    }

    @Override
    public void saveAll(List<Account> entities) {

    }

    @Override
    public List<Account> findAll() {
        return AllAccounts;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Account getOne(long id) {
        return null;
    }
}
