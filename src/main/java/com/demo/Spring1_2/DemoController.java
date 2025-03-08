package com.demo.Spring1_2;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
	
	
	public String getPrint() {
		return "Hello from controller";
	}
}
