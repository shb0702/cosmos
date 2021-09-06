package cosmos.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class TestController {
	
	@GetMapping(value = "/")
		public String init() {
		
		return "index.html";
	}

	@GetMapping(value = "/hellow1")
	public ResponseEntity<?> hellow1() throws Exception {
		
		Map<String, String> out = new HashMap<>();
		out.put("result", "Hellow World 1");
		
		return new ResponseEntity<Map<String, String>>(out, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/hellow2", method = RequestMethod.GET)
	public ResponseEntity<?> hellow2() throws Exception {
		
		Map<String, String> out = new HashMap<>();
		out.put("result", "Hellow World 2");
		
		return new ResponseEntity<Map<String, String>>(out, HttpStatus.OK);
	}
}
