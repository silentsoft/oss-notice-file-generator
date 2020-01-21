# OSS Notice File Generator

## Usage
```java
public static void main(String[] args) {
	System.out.println("--------START OF THE NOTICE FILE--------");
	
	String markdown = NoticeFileGenerator.generate("{{Your Product Name}}", "{{Your Organization Name}}", new String[] {
			"This product includes software developed by {{Your Organization Name}}.",
			"This product includes software developed by The Apache Software Foundation (http://www.apache.org/)."
	}, new Library[] {
			new Library("first-3rd-party", "1.2.3", "https://github.com/silentsoft/first-3rd-party", new ApacheLicense2()),
			new Library("second-3rd-party", "1.2.3", "https://github.com/silentsoft/second-3rd-party", new MITLicense())
	});
	System.out.println(markdown);
	
	System.out.println("---------END OF THE NOTICE FILE---------");
}
```

## Dependency
```
<repositories>
    <repository>
        <id>silentsoft-repository</id>
        <url>http://nexus.silentsoft.org/repository/maven-public</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>org.silentsoft.oss</groupId>
        <artifactId>notice-file-generator</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please note we have a [CODE_OF_CONDUCT](https://github.com/silentsoft/oss-notice-file-generator/blob/master/CODE_OF_CONDUCT.md), please follow it in all your interactions with the project.
