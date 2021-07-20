package org.silentsoft.oss;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
	
	private String name;
	
	private String version;
	
	private String url;
	
	private License[] licenses;
	
	public Library(String name, String url, License... licenses) {
		this(name, "", url, licenses);
	}
	
	public Library(String name, String version, String url, License... licenses) {
		this.name = name;
		this.version = version;
		this.url = url;
		this.licenses = licenses;
	}
	
	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public String getUrl() {
		return url;
	}

	public License[] getLicenses() {
		return licenses;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.format("__%s__\r\n", "".equals(version) ? name : String.join(" ", name, version)));
		if (url != null && "".equals(url) == false) {
			buffer.append(String.format(" * %s\r\n", url));
		}
		if (licenses != null && licenses.length > 0) {
			buffer.append(String.format(" * %s\r\n", String.join(", ", Stream.of(licenses).map(License::getName).collect(Collectors.toList()))));//license.getName()));
		}
		return buffer.toString();
	}

}
