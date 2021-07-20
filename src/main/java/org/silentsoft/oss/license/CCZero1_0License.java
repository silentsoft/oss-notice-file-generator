package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Creative Commons Zero v1.0 Universal
 * 
 * @author silentsoft
 */
public class CCZero1_0License extends License {

	public CCZero1_0License() {
		super("CC0-1.0", CCZero1_0License.class.getResourceAsStream("/license/CC0-1.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Creative Commons Zero v1.0 Universal", "CC0-1.0" };
	}

}
