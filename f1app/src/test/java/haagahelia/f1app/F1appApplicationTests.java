package haagahelia.f1app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import haagahelia.f1app.web.f1Controller;

@SpringBootTest
class F1appApplicationTests {

@Autowired
private f1Controller controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
