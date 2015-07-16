package cn.hoyoung.app.spring_src_study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hoyoung.app.spring_src_study.service.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        DemoService service = ctx.getBean(DemoService.class);
        service.sayHello();
        
    }
}
