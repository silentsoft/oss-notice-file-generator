package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class MITLicense extends License {
	
	public MITLicense() {
		super("MIT License", MITLicense.class.getResourceAsStream("/license/MIT License.txt"));
	}

}
