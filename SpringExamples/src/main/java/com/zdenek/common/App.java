package com.zdenek.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();

        Enricher.enricher(stringBuilder);
        System.out.println(stringBuilder);

        /*
        for (int i = 1; i <= 10; i++) {
            //stringBuilder.append("x");
            //System.out.println(i + ":" + stringBuilder);
            //Thread.sleep(0);


        }

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigTest.class);
        AppConfigTest appConfigTest =  ctx.getBean(AppConfigTest.class);
        System.out.println(appConfigTest.ReadProperties());
        System.out.println(appConfigTest.prase());
        System.out.println(appConfigTest.getTest());

        Interface anInterface = new InterfaceIml2();
        System.out.println(anInterface.print());
*/

    }


    public User getUser() {
        return new
                User.UserBuilder("Jhon", "Doe")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();
    }
}
