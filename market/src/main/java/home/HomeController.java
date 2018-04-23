package home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import branch.vo.Branch;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping(path = "/index")
	public Branch listBranch() {
		System.out.println("call listBranch");
		return null;
	}
	
}
