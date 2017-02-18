package wx.intel.data.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("wx.intel.data.app")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}