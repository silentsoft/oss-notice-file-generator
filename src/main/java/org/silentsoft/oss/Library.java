package org.silentsoft.oss;

public class Library {
	
	private String name;
	
	private String version;
	
	private String url;
	
	private License license;
	
	public Library(String name, String url, License license) {
		this(name, "", url, license);
	}
	
	public Library(String name, String version, String url, License license) {
		this.name = name;
		this.version = version;
		this.url = url;
		this.license = license;
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

	public License getLicense() {
		return license;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(String.format("__%s__\r\n", "".equals(version) ? name : String.join(" ", name, version)));
		if ("".equals(url) == false) {
			buffer.append(String.format(" * %s\r\n", url));
		}
		buffer.append(String.format(" * %s\r\n", license.getLicenseName()));
		return buffer.toString();
	}

}
