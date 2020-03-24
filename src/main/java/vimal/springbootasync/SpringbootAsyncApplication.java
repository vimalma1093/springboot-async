package vimal.springbootasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class SpringbootAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAsyncApplication.class, args);
	}

	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(1000);
		executor.setMaxPoolSize(1000);
		executor.setQueueCapacity(1000);
		executor.setThreadNamePrefix("JDAsync-");
		executor.initialize();
		return executor;
	}
}
