package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Open Data Commons Attribution License v1.0
 * 
 * @author silentsoft
 */
public class ODCBy1_0License extends License {

	public ODCBy1_0License() {
		super("ODC-By-1.0", ODCBy1_0License.class.getResourceAsStream("/license/ODC-By-1.0.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "Open Data Commons Attribution License v1.0", "Open Data Commons Attribution License 1.0", "Open Data Commons Attribution License Version 1.0", "ODC-By-1.0", "ODC By 1.0" };
	}

}
