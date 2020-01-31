package org.silentsoft.oss;

import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.silentsoft.oss.license.ApacheLicense2;
import org.silentsoft.oss.license.MITLicense;

public class NoticeFileGeneratorTest {
	
	@Test
	public void templateTest() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("# %s\r\n");
		buffer.append("Copyright (c) %s. All rights reserved.\r\n");
		buffer.append("\r\n");
		buffer.append("%s\r\n\r\n");
		
		Assert.assertEquals(buffer.toString().trim(), NoticeFileGenerator.newInstance("%s", "%s").addText("%s").generate().trim());
		
		buffer.append("%s\r\n\r\n");
		
		Assert.assertEquals(buffer.toString().trim(), NoticeFileGenerator.newInstance("%s", "%s").addText("%s").addText("%s").generate().trim());
	}
	
	@Test
	public void generateTest() {
		StringBuffer case1 = new StringBuffer();
		case1.append("# {{Your Product Name}}");
		
		Assert.assertEquals(case1.toString(), NoticeFileGenerator.newInstance("{{Your Product Name}}").generate().trim());
		
		StringBuffer case2 = new StringBuffer();
		case2.append("# {{Your Product Name}}");
		case2.append("\r\n");
		case2.append("Copyright (c) {{Your Organization}}. All rights reserved.");
		
		Assert.assertEquals(case2.toString(), NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").generate().trim());
	}
		
	@Test
	public void noticeEqualsTest() {
		String a = NoticeFileGenerator.newInstance("{{Your Product Name}}").generate();
		String b = NoticeFileGenerator.newInstance("{{Your Product Name}}", "").generate();
		String c = NoticeFileGenerator.newInstance("{{Your Product Name}}", null).generate();
		
		Assert.assertTrue(a.equals(b));
		Assert.assertTrue(b.equals(c));
	}
	
	@Test
	public void addLibraryTest() {
		String a = NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").addLibrary("name version", "url", new ApacheLicense2()).generate();
		String b = NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").addLibrary("name", "version", "url", new ApacheLicense2()).generate();
		
		Assert.assertTrue(a.equals(b));
	}
	
	@Test
	public void licenseEqualsTest() {
		License a = new ApacheLicense2();
		License b = new ApacheLicense2();
		License c = new MITLicense();
		
		Assert.assertTrue(a.equals(b));
		Assert.assertFalse(b.equals(c));
	}
	
	@Test
	public void licenseStreamDistinctTest() {
		Function<License[], String> texts = (licenses) -> {
			StringBuffer buffer = new StringBuffer();
			Stream.of(licenses).distinct().forEach((license) -> {
				buffer.append(String.format("%s\r\n", license.toString()));	
			});
			
			return buffer.toString();
		};
		
		String a = texts.apply(new License[] {new ApacheLicense2()});
		String b = texts.apply(new License[] {new ApacheLicense2(), new ApacheLicense2()});
		
		Assert.assertTrue(a.equals(b));
	}

}
