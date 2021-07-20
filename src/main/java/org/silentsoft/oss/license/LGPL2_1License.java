package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * GNU Lesser General Public License v2.1
 * 
 * @author silentsoft
 */
public class LGPL2_1License extends License {
	
	public LGPL2_1License() {
		super("LGPL-2.1", LGPL2_1License.class.getResourceAsStream("/license/LGPL-2.1.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"GNU Lesser General Public License v2.1",
				"GNU Lesser General Public License v2.1 only",
				"GNU Lesser General Public License v2.1 or later",
				"GNU Library General Public License v2.1",
				"GNU Library General Public License v2.1 only",
				"GNU Library General Public License v2.1 or later",
				"LGPL 2.1",
				"LGPL-2.1"
		};
	}

}
