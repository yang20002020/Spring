package Demo;

import com.fuyu.config.SpringConfig;
import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class demo3 {
    public static void main(String[] args){
       ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1=(BookDao)ctx.getBean(BookDao.class);
        BookDao bookDao2=(BookDao)ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
