package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * zlib License
 * 
 * @author silentsoft
 */
public class ZlibLicense extends License {

	public ZlibLicense() {
		super("zlib License", ZlibLicense.class.getResourceAsStream("/license/Zlib License.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "zlib", "zlib License" };
	}

}
