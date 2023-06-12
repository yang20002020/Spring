package Demo;
import com.fuyu.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3 {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
