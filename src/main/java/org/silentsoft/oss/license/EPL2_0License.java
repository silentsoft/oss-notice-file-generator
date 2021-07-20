package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Eclipse Public License v2.0
 * 
 * @author silentsoft
 */
public class EPL2_0License extends License {
	
	public EPL2_0License() {
		super("EPL-2.0", EPL2_0License.class.getResourceAsStream("/license/EPL-2.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] {
				"Eclipse Public License v2.0",
				"Eclipse Public License - v 2.0",
				"Eclipse Public License v. 2.0",
				"Eclipse Public License 2.0",
				"EPL 2.0",
				"EPL-2.0"
		};
	}

}
