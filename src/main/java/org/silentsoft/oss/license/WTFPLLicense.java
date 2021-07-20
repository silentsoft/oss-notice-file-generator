package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Do What The F*ck You Want To Public License
 * 
 * @author silentsoft
 */
public class WTFPLLicense extends License {

	public WTFPLLicense() {
		super("WTFPL", WTFPLLicense.class.getResourceAsStream("/license/WTFPL.txt"));
	}

	@Override
	public String[] getAliases() {
		return new String[] { "WTFPL", "WTFPL License", "Do What The F*ck You Want To Public License", "Do What The Fuck You Want To Public License" };
	}

}
