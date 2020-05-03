package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * BSD 2-Clause "Simplified" License
 * 
 * @author silentsoft
 */
public class BSD2ClauseLicense extends License {
	
	public BSD2ClauseLicense() {
		super("BSD-2-Clause", BSD2ClauseLicense.class.getResourceAsStream("/license/BSD-2-Clause.txt"));
	}

}
