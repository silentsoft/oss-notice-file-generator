package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Use {@link ApacheLicense2_0} instead.
 * 
 * @author silentsoft
 */
@Deprecated
public class ApacheLicense2 extends License {

	public ApacheLicense2() {
		super("Apache License 2.0", ApacheLicense2.class.getResourceAsStream("/license/Apache License 2.0.txt"));
	}

}
