package in.practice.ajinkya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empPage")
public class EmployeeController {
	@GetMapping("/emp")
	public String showContact() {
		return "EmpPage";
	}
}
