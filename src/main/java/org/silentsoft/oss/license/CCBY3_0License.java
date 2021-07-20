package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Creative Commons Attribution 3.0 Unported
 * 
 * @author silentsoft
 */
public class CCBY3_0License extends License {

	public CCBY3_0License() {
		super("CC-BY-3.0", CCBY3_0License.class.getResourceAsStream("/license/CC-BY-3.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Creative Commons Attribution 3.0 Unported", "CC-BY-3.0", "CC BY 3.0" };
	}

}
