package com.shreya.client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Use test profile
class EurekaClientApplicationTests {

	@Test
	void contextLoads() {
		// Test will pass if context loads
	}
}