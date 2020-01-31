package org.silentsoft.oss;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class NoticeFileGenerator {
	
	private String productName;
	private String owner;
	private List<String> texts;
	private List<Library> libraries;
	
	private NoticeFileGenerator() {
		
	}
	
	private NoticeFileGenerator(NoticeFileBuilder builder) {
		this.productName = builder.productName;
		this.owner = builder.owner;
		this.texts = builder.texts;
		this.libraries = builder.libraries;
	}
	
	public String generate() {
		return generate(productName, owner, texts.toArray(new String[0]), libraries.toArray(new Library[0]));
	}
	
	public static String generate(String productName, String owner, String[] texts, Library[] libraries) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(String.format("# %s\r\n", productName));
		if (owner != null && "".equals(owner.trim()) == false) {
			buffer.append(String.format("Copyright (c) %s. All rights reserved.\r\n", owner));
		}
		buffer.append("\r\n");
		
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
	
	public static NoticeFileBuilder newInstance(String productName) {
		return new NoticeFileBuilder(productName);
	}
	
	public static NoticeFileBuilder newInstance(String productName, String owner) {
		return new NoticeFileBuilder(productName, owner);
	}
	
	public static class NoticeFileBuilder {
		private String productName;
		private String owner;
		private List<String> texts;
		private List<Library> libraries;
		
		private NoticeFileBuilder(String productName) {
			this(productName, null);
		}
		
		private NoticeFileBuilder(String productName, String owner) {
			this.productName = productName;
			this.owner = owner;
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
