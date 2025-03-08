package com.demo.Spring1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class Mobile {
	@Autowired
	 Processor cpu;
	
	
	public void Specifications() {
		 cpu.ProcessorUsage();
		System.out.println("DISPLAY: 13.00 in.\r\n"
				+ "Camera: 50 + 50 megapixels.\r\n"
				+ "RAM: 20 GB.\r\n"
				+ "Battery: 13000 mAh.\r\n"
				+ "OS: Android 15, One UI 8 user interface.\r\n"
				+ "Chipset(processor):"+ cpu);
		
	}
}
