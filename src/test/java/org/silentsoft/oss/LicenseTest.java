package org.silentsoft.oss;

import org.junit.Assert;
import org.junit.Test;
import org.silentsoft.oss.license.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LicenseTest {

	@Test
	public void contentTest() throws IOException {
		check("/license/AFL-1.1.txt", new AFL1_1License());
		check("/license/AFL-1.2.txt", new AFL1_2License());
		check("/license/AFL-2.0.txt", new AFL2_0License());
		check("/license/AFL-2.1.txt", new AFL2_1License());
		check("/license/AFL-3.0.txt", new AFL3_0License());
		check("/license/Apache License 2.0.txt", new ApacheLicense2());
		check("/license/Apache License 2.0.txt", new ApacheLicense2_0());
		check("/license/BCL License.txt", new BCLLicense());
		check("/license/BSD-2-Clause.txt", new BSD2ClauseLicense());
		check("/license/BSD-3-Clause.txt", new BSD3ClauseLicense());
		check("/license/0BSD.txt", new BSDZeroClauseLicense());
		check("/license/CC-BY-3.0.txt", new CCBY3_0License());
		check("/license/CC-BY-4.0.txt", new CCBY4_0License());
		check("/license/CC0-1.0.txt", new CCZero1_0License());
		check("/license/CDDL-1.1.txt", new CDDL1_1License());
		check("/license/EDL-1.0.txt", new EDL1_0License());
		check("/license/EPL-1.0.txt", new EPL1_0License());
		check("/license/EPL-2.0.txt", new EPL2_0License());
		check("/license/GPL-2.0-CE.txt", new GPL2_0CELicense());
		check("/license/GPL-2.0.txt", new GPL2_0License());
		check("/license/GPL-3.0.txt", new GPL3_0License());
		check("/license/ICU License.txt", new ICULicense());
		check("/license/ISC License.txt", new ISCLicense());
		check("/license/JSON License.txt", new JSONLicense());
		check("/license/LGPL-2.1.txt", new LGPL2_1License());
		check("/license/LGPL-3.0.txt", new LGPL3_0License());
		check("/license/LGPL-3.0.txt", new LGPL3License());
		check("/license/MIT License.txt", new MITLicense());
		check("/license/MPL-1.1.txt", new MPL1_1License());
		check("/license/MPL-2.0.txt", new MPL2_0License());
		check("/license/ODC-By-1.0.txt", new ODCBy1_0License());
		check("/license/Python-2.0.txt", new Python2_0License());
		check("/license/Unlicense.txt", new Unlicense());
		check("/license/WTFPL.txt", new WTFPLLicense());
		check("/license/Zlib License.txt", new ZlibLicense());
	}

	private void check(String resource, License license) throws IOException {
		String content = read(resource);
		Assert.assertEquals(content, license.getContent());
		Assert.assertEquals(content, License.of(license.getName()).getContent());
		if (license.getAliases() != null && license.getAliases().length > 0) {
			for (String alias : license.getAliases()) {
				Assert.assertEquals(content, License.of(alias).getContent());
			}
		}
	}

	private String read(String resource) throws IOException {
		StringBuffer buffer = new StringBuffer();

		try (InputStreamReader inputStreamReader = new InputStreamReader(LicenseTest.class.getResourceAsStream(resource));
		     BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
				buffer.append("\r\n");
			}
		}

		return buffer.toString();
	}

}
