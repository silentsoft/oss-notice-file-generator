package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * GNU General Public License v3.0
 * 
 * @author silentsoft
 */
public class GPL3_0License extends License {
	
	public GPL3_0License() {
		super("GPL-3.0", GPL3_0License.class.getResourceAsStream("/license/GPL-3.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"GNU General Public License v3.0",
				"GNU General Public License v3.0 only",
				"GNU General Public License v3.0 or later",
				"GPL 3.0",
				"GPL-3.0"
		};
	}

}
