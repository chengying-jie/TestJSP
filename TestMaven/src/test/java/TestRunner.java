import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @Auther: zhangjie
 * @Date: 2021/6/9 - 06 - 09 - 19:50
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMessageDemo.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("测试结果: " + result.wasSuccessful());

    }
}
