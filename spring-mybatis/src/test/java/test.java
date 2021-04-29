import com.viki.entity.User;
import com.viki.mapper.UserMapper;
import com.viki.mapper.impl.UserMapperImpl;
import com.viki.mapper.impl.UserMapperImpl2;
import com.viki.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    private ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");


    @Test
    public void query() {
        SqlSession session = MybatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.query();

        for (User u : list) {
            System.out.println(u);
        }
    }

    @Test
    public void test() {

        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);

        List<User> query = userMapper.query();

        for (User u : query) {
            System.out.println(u);
        }
    }

    @Test
    public void test2() {
        UserMapperImpl2 bean = context.getBean("userMapper2", UserMapperImpl2.class);
        List<User> list = bean.query();
        for (User u :
                list) {
            System.out.println(u);
        }
    }

    @Test
    public void test3(){
        User user = context.getBean("user", User.class);

        System.out.println(user);
    }
}
