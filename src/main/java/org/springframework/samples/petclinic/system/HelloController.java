package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WeHelloController {

	@GetMapping("/hello")
	public String welcome() {
		return "hello";
	}

}
