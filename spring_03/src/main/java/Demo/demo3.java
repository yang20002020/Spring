package Demo;

import com.fuyu.dao.BookDao;
import com.fuyu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3 {
    public static void main(String[] args){
        //3.获得IoC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        BookService  boookService=(BookService)ctx.getBean("bookService123");
        boookService.save();

    }
}
