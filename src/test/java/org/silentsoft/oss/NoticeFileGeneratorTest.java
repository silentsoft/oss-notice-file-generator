package org.silentsoft.oss;

import org.junit.Assert;
import org.junit.Test;
import org.silentsoft.oss.license.ApacheLicense2;

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
		StringBuffer buffer = new StringBuffer();
		buffer.append("# {{Your Product Name}}");
		buffer.append("\r\n");
		buffer.append("Copyright (c) {{Your Organization}}. All rights reserved.");
		
		Assert.assertEquals(buffer.toString(), NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").generate().trim());
	}
	
	@Test
	public void addLibraryTest() {
		String a = NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").addLibrary("name version", "url", new ApacheLicense2()).generate();
		String b = NoticeFileGenerator.newInstance("{{Your Product Name}}", "{{Your Organization}}").addLibrary("name", "version", "url", new ApacheLicense2()).generate();
		Assert.assertTrue(a.equals(b));
	}

}
