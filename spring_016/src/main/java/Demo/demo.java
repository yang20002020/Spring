package Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;

public class demo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----------------------------------");
        DataSource dataSource1 = (DataSource) ctx.getBean("dataSource1");
        System.out.println(dataSource1);
    }
}
