package Demo;
import com.fuyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3 {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService) ctx.getBean("bookService123");
        bookService.save();

    }
}
