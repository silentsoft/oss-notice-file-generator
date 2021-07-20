package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Mozilla Public License 1.1
 * 
 * @author silentsoft
 */
public class MPL1_1License extends License {

	public MPL1_1License() {
		super("MPL-1.1", MPL1_1License.class.getResourceAsStream("/license/MPL-1.1.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Mozilla Public License 1.1", "Mozilla Public License v1.1", "Mozilla Public License Version 1.1", "MPL 1.1", "MPL-1.1" };
	}

}
