import com.yifan.dao.UserDao;
import com.yifan.dao.impl.UserDaoImpl;
import com.yifan.diy.AnnocationPointCut;
import com.yifan.handler.InvocationHGandler;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
   private ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void test(){
        UserDao userImpl = context.getBean("userImpl", UserDao.class);
        userImpl.show();
    }

    @Test
    public void test22(){
        UserDao userImpl = context.getBean("userImpl", UserDao.class);
        userImpl.show();
    }

    @Test
    public void test3() {
        UserDaoImpl userDao = new UserDaoImpl();
        InvocationHGandler vh = new InvocationHGandler();

        vh.setUserDao(userDao);
        UserDao proxy = (UserDao) vh.getProxy();
        proxy.show();
    }

    /**
     * 注解 实现切面
     */
    @Test
    public void test4(){
        UserDao userImpl = context.getBean("userImpl", UserDao.class);

        userImpl.show();
    }
}
