package Demo;
import com.fuyu.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class demo {
    public static void main(String[] args) {
        Resource resources=new ClassPathResource("applicationContext.xml");
        BeanFactory bf=new XmlBeanFactory(resources);
        BookDao bookDao= bf.getBean(BookDao.class);
        bookDao.save();
    }
}
