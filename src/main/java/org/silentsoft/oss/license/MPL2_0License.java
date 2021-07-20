package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Mozilla Public License 2.0
 * 
 * @author silentsoft
 */
public class MPL2_0License extends License {

	public MPL2_0License() {
		super("MPL-2.0", MPL2_0License.class.getResourceAsStream("/license/MPL-2.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Mozilla Public License 2.0", "Mozilla Public License v2.0", "Mozilla Public License Version 2.0", "MPL 2.0", "MPL-2.0" };
	}

}
