package fuyu.test;

import com.fuyu.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
客户端代码
 */
public class SpringTest {
   @Test
   //测试scope 属性
    public void test1(){
       ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
       UserDao userDao1=(UserDao) app.getBean("userDao");
       UserDao userDao2=(UserDao) app.getBean("userDao");
       System.out.println(userDao1);
       System.out.println(userDao2);

   }
}