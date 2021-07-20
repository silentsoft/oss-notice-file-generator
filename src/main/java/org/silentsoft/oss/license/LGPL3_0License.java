package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * GNU Lesser General Public License v3.0
 * 
 * @author silentsoft
 */
public class LGPL3_0License extends License {
	
	public LGPL3_0License() {
		super("LGPL-3.0", LGPL3_0License.class.getResourceAsStream("/license/LGPL-3.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"GNU Lesser General Public License v3.0",
				"GNU Lesser General Public License v3.0 only",
				"GNU Lesser General Public License v3.0 or later",
				"GNU Library General Public License v3.0",
				"GNU Library General Public License v3.0 only",
				"GNU Library General Public License v3.0 or later",
				"LGPL 3.0",
				"LGPL-3.0"
		};
	}

}
