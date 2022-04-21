package com.saitej.core.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PaymentServiceImplTest {
    @Autowired
	PaymentService service;

	@Test
	void TestDI() {
		assertNotNull(service);
	}

}
