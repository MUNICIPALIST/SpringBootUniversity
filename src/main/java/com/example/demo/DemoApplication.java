package com.example.demo;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "q") int q) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("w");
		String formattedDateTime = now.format(formatter);

		return String.format("Number that you want to response: %d. Current time: %s", q, formattedDateTime);
	}

	@GetMapping("/number")
	public int getNumbers(@RequestParam(value = "n") int n) {
		Random random = new Random();
		float number = 0;
		int result = random.nextInt(500) ;
		return result;
	}

	@GetMapping("/fibonacci")
	public int fibonacci() {
		int n = 2;
		if (n <= 1) {
			return n;
		}
		int prev1 = 0, prev2 = 1;
		for (int i = 2; i <= n; i++) {
			int current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return prev2;
	}















	public class InputToString {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введите значение: ");
			String input = scanner.nextLine();
			System.out.println("Введенное значение: " + input);
			scanner.close();
		}
	}




	@GetMapping("/power")
	public int power(@RequestParam(value = "n")int n){
		int result = 1;
		for (int i = 0; i < n; i++){
			result = result * 2;
		}
		return result;
	}





}
