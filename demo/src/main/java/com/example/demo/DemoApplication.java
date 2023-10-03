package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.template.HtmlTemplate;
import com.example.demo.template.Login;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.demo.template.Home;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		Login login = new Login();
		String component = login.getRenderHtml();
		String render = new HtmlTemplate(component).getTemplate();
		return render;
	}

	@GetMapping("/home")
	public String home() {
		// Check if the user is logged in

		// Render the home page
		String component = new Home().getRenderHtml();
		String render = new HtmlTemplate(component).getTemplate();
		return render;
	}

	@PostMapping("/login")
	public RedirectView login(@RequestParam String email, @RequestParam String password) {
		// Validate the email and password
		if (!email.equals("raman@gmail.com") || !password.equals("1234")) {
			return new RedirectView("/login");
		}
		// Redirect to the home page

		return new RedirectView("/home");
	}

}
