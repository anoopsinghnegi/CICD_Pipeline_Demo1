package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
        @GetMapping("/bingo")
        public String bingo() {
                return "bingo";
        }
        @GetMapping("/devops")
        public String devops() {
                return "devops";
        }
}

