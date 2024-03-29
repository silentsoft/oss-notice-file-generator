package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * MIT License
 * 
 * @author silentsoft
 */
public class MITLicense extends License {
	
	public MITLicense() {
		super("MIT License", MITLicense.class.getResourceAsStream("/license/MIT License.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "MIT License", "The MIT License", "MIT" };
	}

}
