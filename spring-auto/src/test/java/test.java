import com.yifan.config.VikiConfig;
import com.yifan.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(VikiConfig.class);

        User getUser = context.getBean("getUser",User.class);

        System.out.println(getUser.name.toString());
    }
}
