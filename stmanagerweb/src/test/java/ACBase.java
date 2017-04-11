import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/11.
 */
public class ACBase {
    public static ApplicationContext getAC(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/*.xml");
        return ac;
    }
}
