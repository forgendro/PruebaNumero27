package com.gfi.PruebaNumero27;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {  PruebaNumero27App.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class PruebaNumero27AppTest {

	@Autowired
	private  PruebaNumero27App app;
	
	/**
	 * Test context loaded
	 */
	@Test
	public void contextLoads() {
		assertThat(app).isNotNull();
	}

	/**
	 * Test destroy context
	 */
	@Test
	public void fire() {

	}

}
