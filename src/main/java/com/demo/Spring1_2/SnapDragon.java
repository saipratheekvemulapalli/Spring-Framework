package com.demo.Spring1_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration

public class SnapDragon implements Processor {
	
	public void ProcessorUsage() {
		System.out.println("best for high gaming and longlasting and doesn't impacts on battery life");
	}
	
}
