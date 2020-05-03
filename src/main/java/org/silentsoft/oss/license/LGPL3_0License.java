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

}
