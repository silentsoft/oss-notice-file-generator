package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class ICULicense extends License {
	
	public ICULicense() {
		super("ICU License", ICULicense.class.getResourceAsStream("/license/ICU License.txt"));
	}

}
