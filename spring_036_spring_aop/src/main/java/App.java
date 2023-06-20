import com.fuyu.config.SpringConfig;
import com.fuyu.dao.BookDao;
import com.fuyu.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);
        bean.update();
        System.out.println(bean);
        System.out.println(bean.getClass());

    }
}
