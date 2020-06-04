package com.example.test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*; 
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testHello()
	{
		assertEquals(new DemoApplication().hello(),"Hello H3C Demo!");
	}

}
