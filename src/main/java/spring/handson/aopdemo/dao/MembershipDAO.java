package spring.handson.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addSomething() {

        System.out.println(getClass() + "Doing some stuff in membershipDAO class");

        return true;
    }
}
