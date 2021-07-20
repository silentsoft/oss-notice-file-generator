package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Creative Commons Attribution 4.0 International
 * 
 * @author silentsoft
 */
public class CCBY4_0License extends License {

	public CCBY4_0License() {
		super("CC-BY-4.0", CCBY4_0License.class.getResourceAsStream("/license/CC-BY-4.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Creative Commons Attribution 4.0 International", "CC-BY-4.0", "CC BY 4.0" };
	}

}
