package com.shrug.Test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void tulletest() {
		int a = 1;
		assert(a == 1);
	}

}
