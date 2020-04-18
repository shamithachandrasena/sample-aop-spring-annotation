package com.samsl;

import com.samsl.Car;
import com.samsl.ExecutionService;
import com.samsl.JsonSerializeException;
import com.samsl.JsonSerializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectMicroApplicationTests {
	@Autowired
	ExecutionService executionService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testExecutor() {
		System.out.println(executionService.executor());
	}

	@Test
	public void testSeralizer(){
		Car car = new Car("Ford", "F150", "2018");
		JsonSerializer serializer = new JsonSerializer();
		try {
			serializer.serialize(car);
		} catch (JsonSerializeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAnnotationLogger() {
		try {
			executionService.serve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
	}
}
