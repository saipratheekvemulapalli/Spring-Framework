package com.demo.Spring1_2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Exnoys implements Processor {

	public void ProcessorUsage() {
		System.out.println("less in processing and mostly used in phones");

	}

}
