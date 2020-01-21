package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class BSD3ClauseLicense extends License {
	
	public BSD3ClauseLicense() {
		super("BSD-3-Clause", BSD3ClauseLicense.class.getResourceAsStream("/license/BSD-3-Clause.txt"));
	}

}
