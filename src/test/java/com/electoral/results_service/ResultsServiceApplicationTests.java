package com.electoral.results_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"DB_URL=jdbc:h2:mem:results_test;MODE=PostgreSQL;DB_CLOSE_DELAY=-1",
		"DB_USER=sa",
		"DB_PASSWORD=",
		"spring.datasource.driver-class-name=org.h2.Driver",
		"spring.flyway.enabled=false"
})
class ResultsServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
