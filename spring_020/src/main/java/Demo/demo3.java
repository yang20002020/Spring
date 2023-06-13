package Demo;

import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3 {
    public static void main(String[] args){

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao  bookDao=(BookDao)ctx.getBean("bookDao123");
        System.out.println(bookDao);
        BookService bookService=ctx.getBean(BookService.class);
        System.out.println(bookService);

    }
}
