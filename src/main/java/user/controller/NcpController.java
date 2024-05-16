package user.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NcpController {

	@GetMapping(value="plus")
	public String plus(@RequestParam(value="a")String a,@RequestParam(value="b") String b) {
		
		return a+b;
	}
	
	
	
}
