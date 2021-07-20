package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.1
 * 
 * @author silentsoft
 */
public class CDDL1_1License extends License {

	public CDDL1_1License() {
		super("CDDL-1.1", CDDL1_1License.class.getResourceAsStream("/license/CDDL-1.1.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.1",
				"Common Development and Distribution License 1.1",
				"CDDL 1.1",
				"CDDL-1.1"
		};
	}

}
