package org.silentsoft.oss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.Assert;
import org.junit.Test;
import org.silentsoft.oss.license.ApacheLicense2;
import org.silentsoft.oss.license.ApacheLicense2_0;
import org.silentsoft.oss.license.BCLLicense;
import org.silentsoft.oss.license.BSD2ClauseLicense;
import org.silentsoft.oss.license.BSD3ClauseLicense;
import org.silentsoft.oss.license.GPL2_0License;
import org.silentsoft.oss.license.GPL3_0License;
import org.silentsoft.oss.license.ICULicense;
import org.silentsoft.oss.license.JSONLicense;
import org.silentsoft.oss.license.LGPL2_1License;
import org.silentsoft.oss.license.LGPL3License;
import org.silentsoft.oss.license.LGPL3_0License;
import org.silentsoft.oss.license.MITLicense;

public class LicenseTest {
	
	@Test
	public void ApacheLicense2Test() throws IOException {
		Assert.assertEquals(read("/license/Apache License 2.0.txt"), new ApacheLicense2().getContent());
	}
	
	@Test
	public void ApacheLicense2_0Test() throws IOException {
		Assert.assertEquals(read("/license/Apache License 2.0.txt"), new ApacheLicense2_0().getContent());
	}
	
	@Test
	public void BCLLicenseTest() throws IOException {
		Assert.assertEquals(read("/license/BCL License.txt"), new BCLLicense().getContent());
	}
	
	@Test
	public void BSD2ClauseLicenseTest() throws IOException {
		Assert.assertEquals(read("/license/BSD-2-Clause.txt"), new BSD2ClauseLicense().getContent());
	}
	
	@Test
	public void BSD3ClauseLicenseTest() throws IOException {
		Assert.assertEquals(read("/license/BSD-3-Clause.txt"), new BSD3ClauseLicense().getContent());
	}
	
	@Test
	public void GPL2_0LicenseTest() throws IOException {
		Assert.assertEquals(read("/license/GPL-2.0.txt"), new GPL2_0License().getContent());
	}
	
	@Test
	public void GPL3_0LicenseTest() throws IOException {
		Assert.assertEquals(read("/license/GPL-3.0.txt"), new GPL3_0License().getContent());
	}
	
	@Test
	public void ICULicenseTest() throws IOException {
		Assert.assertEquals(read("/license/ICU License.txt"), new ICULicense().getContent());
	}
	
	@Test
	public void JSONLicenseTest() throws IOException {
		Assert.assertEquals(read("/license/JSON License.txt"), new JSONLicense().getContent());
	}
	
	@Test
	public void LGPL2_1LicenseTest() throws IOException {
		Assert.assertEquals(read("/license/LGPL-2.1.txt"), new LGPL2_1License().getContent());
	}
	
	@Test
	public void LGPL3_0LicenseTest() throws IOException {
		Assert.assertEquals(read("/license/LGPL-3.0.txt"), new LGPL3_0License().getContent());
	}
	
	@Test
	public void LGPL3LicenseTest() throws IOException {
		Assert.assertEquals(read("/license/LGPL-3.0.txt"), new LGPL3License().getContent());
	}
	
	@Test
	public void MITLicenseTest() throws IOException {
		Assert.assertEquals(read("/license/MIT License.txt"), new MITLicense().getContent());
	}
	
	private String read(String resource) throws IOException {
		return read(new InputStreamReader(LicenseTest.class.getResourceAsStream(resource)));
	}
	
	private String read(Reader reader) throws IOException {
		StringBuffer buffer = new StringBuffer();
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
			buffer.append("\r\n");
		}
		bufferedReader.close();
		
		return buffer.toString();
	}

}
