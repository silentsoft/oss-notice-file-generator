package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Oracle Binary Code License Agreement for the Java SE Platform Products and JavaFX
 * 
 * @author silentsoft
 */
public class BCLLicense extends License {

	public BCLLicense() {
		super("BCL License", BCLLicense.class.getResourceAsStream("/license/BCL License.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "BCL License", "Oracle Binary Code License Agreement for the Java SE Platform Products and JavaFX" };
	}

}
