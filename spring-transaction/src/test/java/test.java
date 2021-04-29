
import com.gtv.entity.User;
import com.gtv.mapper.UserMapper;
import com.gtv.mapper.impl.UserMapperImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class test {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test(){
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        for (User user : userMapper.query()) {
            System.out.println(user);
        }
    }
}
