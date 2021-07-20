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

	@Override
	public String[] getAliases() {
		return new String[] { "Apache License 2.0", "Apache License, Version 2.0", "The Apache License 2.0", "The Apache Software License, Version 2.0", "Apache 2.0", "Apache-2.0" };
	}

}
