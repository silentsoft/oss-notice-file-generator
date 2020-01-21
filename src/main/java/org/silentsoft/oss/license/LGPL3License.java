package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class LGPL3License extends License {
	
	public LGPL3License() {
		super("LGPL-3.0", LGPL3License.class.getResourceAsStream("/license/LGPL-3.0.txt"));
	}

}
