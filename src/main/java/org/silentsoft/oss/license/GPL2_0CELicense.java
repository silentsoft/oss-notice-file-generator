package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * GNU General Public License v2.0 w/Classpath exception
 * 
 * @author silentsoft
 */
public class GPL2_0CELicense extends License {

	public GPL2_0CELicense() {
		super("GPL2 w/ CPE", GPL2_0CELicense.class.getResourceAsStream("/license/GPL-2.0-CE.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"GNU General Public License v2.0 w/Classpath exception",
				"GNU General Public License v2.0 with Classpath exception",
				"GPL2 w/ CPE",
				"GPLv2+CE"
		};
	}

}
