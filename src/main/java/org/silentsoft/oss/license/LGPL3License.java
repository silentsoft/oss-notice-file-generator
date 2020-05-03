package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Use {@link LGPL3_0License} instead.
 * 
 * @author silentsoft
 */
@Deprecated
public class LGPL3License extends License {
	
	public LGPL3License() {
		super("LGPL-3.0", LGPL3License.class.getResourceAsStream("/license/LGPL-3.0.txt"));
	}

}
