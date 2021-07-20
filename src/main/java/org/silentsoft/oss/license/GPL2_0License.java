package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * GNU General Public License v2.0
 * 
 * @author silentsoft
 */
public class GPL2_0License extends License {
	
	public GPL2_0License() {
		super("GPL-2.0", GPL2_0License.class.getResourceAsStream("/license/GPL-2.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"GNU General Public License v2.0",
				"GNU General Public License v2.0 only",
				"GNU General Public License v2.0 or later",
				"GPL 2.0",
				"GPL-2.0"
		};
	}

}
