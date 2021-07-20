package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Eclipse Public License v1.0
 * 
 * @author silentsoft
 */
public class EPL1_0License extends License {
	
	public EPL1_0License() {
		super("EPL-1.0", EPL1_0License.class.getResourceAsStream("/license/EPL-1.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"Eclipse Public License v1.0",
				"Eclipse Public License - v 1.0",
				"Eclipse Public License v. 1.0",
				"Eclipse Public License 1.0",
				"EPL 1.0",
				"EPL-1.0"
		};
	}

}
