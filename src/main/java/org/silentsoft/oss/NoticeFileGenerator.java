package org.silentsoft.oss;

import java.util.stream.Stream;

public class NoticeFileGenerator {
	
	public static String generate(String productName, String organization, String[] additionalTexts, Library[] libraries) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(String.format("# %s\r\n", productName));
		buffer.append(String.format("Copyright (c) %s. All rights reserved.\r\n\r\n", organization));
		
		for (String additionalText : additionalTexts) {
			buffer.append(String.format("%s\r\n\r\n", additionalText));
		}
		for (Library library : libraries) {
			buffer.append(String.format("%s\r\n", library.toString()));
		}
		Stream.of(libraries).map(Library::getLicense).distinct().forEach((license) -> {
			buffer.append(String.format("%s\r\n", license.toString()));	
		});
		
		return buffer.toString().trim();
	}

}
