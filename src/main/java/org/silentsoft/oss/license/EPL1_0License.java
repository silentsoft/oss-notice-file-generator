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

}
