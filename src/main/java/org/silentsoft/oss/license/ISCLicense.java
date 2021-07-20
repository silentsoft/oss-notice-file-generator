package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * ISC License
 * 
 * @author silentsoft
 */
public class ISCLicense extends License {

	public ISCLicense() {
		super("ISC License", ISCLicense.class.getResourceAsStream("/license/ISC License.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "ISC License", "ISC" };
	}

}
