import com.st.mapper.AnswerCommonMapper;
import com.st.pojo.QuestionAnswer;
import org.junit.Test;

/**
 * Created by Administrator on 2017/4/11.
 */
public class TestAnswer {
    @Test
    public void testAdd(){
        AnswerCommonMapper mapper = ACBase.getAC().getBean("answerCommonMapper",AnswerCommonMapper.class);
        QuestionAnswer answer = new QuestionAnswer();
    }
    @Test
    public void testUpdate(){

    }

    @Test
    public void testDelete(){

    }
}
