package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping(value="/")
	String  message(String  msg) {
		return " hi how u ";
		
	}

}
