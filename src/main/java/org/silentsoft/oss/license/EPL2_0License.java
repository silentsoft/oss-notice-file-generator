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

}
