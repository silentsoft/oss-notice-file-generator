package org.silentsoft.oss;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class NoticeFileGenerator {
	
	private String productName;
	private String organization;
	private List<String> texts;
	private List<Library> libraries;
	
	private NoticeFileGenerator() {
		
	}
	
	private NoticeFileGenerator(NoticeFileBuilder builder) {
		this.productName = builder.productName;
		this.organization = builder.organization;
		this.texts = builder.texts;
		this.libraries = builder.libraries;
	}
	
	public String generate() {
		return generate(productName, organization, texts.toArray(new String[0]), libraries.toArray(new Library[0]));
	}
	
	public static String generate(String productName, String organization, String[] texts, Library[] libraries) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(String.format("# %s\r\n", productName));
		buffer.append(String.format("Copyright (c) %s. All rights reserved.\r\n\r\n", organization));
		
		for (String text : texts) {
			buffer.append(String.format("%s\r\n\r\n", text));
		}
		for (Library library : libraries) {
			buffer.append(String.format("%s\r\n", library.toString()));
		}
		Stream.of(libraries).map(Library::getLicense).distinct().forEach((license) -> {
			buffer.append(String.format("%s\r\n", license.toString()));	
		});
		
		return buffer.toString().trim();
	}
	
	public static NoticeFileBuilder newInstance(String productName, String organization) {
		return new NoticeFileBuilder(productName, organization);
	}
	
	public static class NoticeFileBuilder {
		private String productName;
		private String organization;
		private List<String> texts;
		private List<Library> libraries;
		
		private NoticeFileBuilder(String productName, String organization) {
			this.productName = productName;
			this.organization = organization;
			this.texts = new LinkedList<>();
			this.libraries = new LinkedList<>();
		}
		
		public NoticeFileBuilder addText(String text) {
			this.texts.add(text);
			
			return this;
		}
		
		public NoticeFileBuilder addLibrary(Library library) {
			this.libraries.add(library);
			
			return this;
		}
		
		public NoticeFileBuilder addLibrary(String name, String url, License license) {
			return addLibrary(new Library(name, url, license));
		}
		
		public NoticeFileBuilder addLibrary(String name, String version, String url, License license) {
			return addLibrary(new Library(name, version, url, license));
		}
		
		public String generate() {
			return new NoticeFileGenerator(this).generate();
		}
	}

}
