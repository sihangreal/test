package com.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 这个示例包含了mock，当对外部系统接口有依赖时，可用mock技术来屏蔽外部系统的具体实现，本方系统定义好外部系统应响应的内容即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestWithMock {


    //这个实例是一个虚构的模拟实例
//    @Mock
//    private CityService mockService;
//
//    @InjectMocks
//    private CityController s;
//
//
//    //在@Test标注的测试方法之前运行
//    @Before
//    public void setUp() throws Exception {
//        // 初始化测试用例类中由Mockito的注解标注的所有模拟对象
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testWithMock() throws Exception{
//
//    }

}
