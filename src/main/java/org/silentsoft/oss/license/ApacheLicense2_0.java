package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Apache License 2.0
 * 
 * @author silentsoft
 */
public class ApacheLicense2_0 extends License {

	public ApacheLicense2_0() {
		super("Apache License 2.0", ApacheLicense2_0.class.getResourceAsStream("/license/Apache License 2.0.txt"));
	}

}
