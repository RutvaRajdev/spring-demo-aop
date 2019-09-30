package spring.handson.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.handson.aopdemo.dao.AccountDAO;
import spring.handson.aopdemo.dao.MembershipDAO;

public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO  accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account();
        accountDAO.addAccount(account, true);

        System.out.println("\n MembershipDAO method");
        membershipDAO.addSomething();

        context.close();

    }
}
