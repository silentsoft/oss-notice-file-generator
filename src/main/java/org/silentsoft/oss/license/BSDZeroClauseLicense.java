package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * BSD Zero Clause License
 * 
 * @author silentsoft
 */
public class BSDZeroClauseLicense extends License {

	public BSDZeroClauseLicense() {
		super("0BSD", BSDZeroClauseLicense.class.getResourceAsStream("/license/0BSD.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "BSD Zero Clause License", "0BSD" };
	}

}
