package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

public class JSONLicense extends License {
	
	public JSONLicense() {
		super("JSON License", JSONLicense.class.getResourceAsStream("/license/JSON License.txt"));
	}

}
