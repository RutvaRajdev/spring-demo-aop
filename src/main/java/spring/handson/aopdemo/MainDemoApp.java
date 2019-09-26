package spring.handson.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.handson.aopdemo.dao.AccountDAO;

public class MainDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO  accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addAccount();

        System.out.println("\n Let's call it again");
        accountDAO.addAccount();

        context.close();

    }
}
