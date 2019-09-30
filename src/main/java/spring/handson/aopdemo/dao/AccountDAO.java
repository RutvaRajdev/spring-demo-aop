package spring.handson.aopdemo.dao;

import org.springframework.stereotype.Component;
import spring.handson.aopdemo.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass() + ": Adding Account");
    }


}
