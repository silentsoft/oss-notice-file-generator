package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * ICU License - ICU 1.8.1 and later
 * 
 * @author silentsoft
 */
public class ICULicense extends License {
	
	public ICULicense() {
		super("ICU License", ICULicense.class.getResourceAsStream("/license/ICU License.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "ICU License", "ICU License - ICU 1.8.1 and later", "ICU" };
	}

}
