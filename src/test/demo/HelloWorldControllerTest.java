package demo;


import com.lzweb.demo.web.controller.HelloWorldController;
import com.lzweb.demo.web.dao.CityMapper;
import com.lzweb.demo.web.domain.City;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 李智
 * @date 2017/9/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        org.junit.Assert.assertEquals("Hello,World!", new HelloWorldController().sayHello());
    }


    @Autowired
    private CityMapper cityMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        City city = cityMapper.findByName("南昌");
        Assert.assertEquals("我来自：",city.getCityName());
    }

}
