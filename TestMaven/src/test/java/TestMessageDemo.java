import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @Auther: zhangjie
 * @Date: 2021/6/9 - 06 - 09 - 19:50
 * @Description: PACKAGE_NAME 使用junit测试下项目
 * @version: 1.0
 */
public class TestMessageDemo {
    private String message="HelloWorld";
    private MessageDemo messageDemo= new MessageDemo(this.message);
    @Test
    public void testPrintMessage(){
        assertEquals(message,messageDemo.printMessage());
    }


}
