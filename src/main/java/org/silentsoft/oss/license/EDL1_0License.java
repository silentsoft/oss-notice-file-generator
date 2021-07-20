package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Eclipse Distribution License - v 1.0
 * 
 * @author silentsoft
 */
public class EDL1_0License extends License {

	public EDL1_0License() {
		super("EDL-1.0", EDL1_0License.class.getResourceAsStream("/license/EDL-1.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"Eclipse Distribution License - v 1.0",
				"Eclipse Distribution License v. 1.0",
				"EDL 1.0",
				"EDL-1.0"
		};
	}

}
