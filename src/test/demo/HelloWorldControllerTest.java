package demo;


import com.lzweb.demo.web.HelloWorldController;
import org.junit.Test;

/**
 * @author 李智
 * @date 2017/9/3
 */
public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        org.junit.Assert.assertEquals("Hello,World!", new HelloWorldController().sayHello());
    }
}
