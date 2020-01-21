package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class BCLLicense extends License {

	public BCLLicense() {
		super("BCL License", BCLLicense.class.getResourceAsStream("/license/BCL License.txt"));
	}
	
}
