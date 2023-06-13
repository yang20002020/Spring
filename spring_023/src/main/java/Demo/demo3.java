package Demo;

import com.fuyu.config.SpringConfig;
import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class demo3 {
    public static void main(String[] args){
       ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService=(BookService)ctx.getBean(BookService.class);
        System.out.println(bookService);
        bookService.save();
    }
}
