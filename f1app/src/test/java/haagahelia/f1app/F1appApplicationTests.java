package haagahelia.f1app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import haagahelia.f1app.web.GuessController;
import haagahelia.f1app.web.LapController;
import haagahelia.f1app.web.f1Controller;

@SpringBootTest
class F1appApplicationTests {

@Autowired
private f1Controller f1controller;

@Autowired
private GuessController guessController;

@Autowired
private LapController lapController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(f1controller).isNotNull();
	}

	@Test
	public void guessControllerIsPresent() throws Exception {
		assertThat(guessController).isNotNull();
	}

	@Test
	public void lapControllerIsPresent() throws Exception {
		assertThat(lapController).isNotNull();
	}

}
