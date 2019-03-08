package com.boat.dasboat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// import org.junit.runner.RunWith;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.junit4.SpringRunner;
import com.boat.dasboat.controller.HomeController;

// @RunWith(SpringRunner.class)
// @SpringBootTest
public class DasBoatApplicationTests {

	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "das boat, reporting for duty!");
	}

}
