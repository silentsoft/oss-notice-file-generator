package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * JSON License
 * 
 * @author silentsoft
 * @see <a href="https://www.json.org/license.html">https://www.json.org/license.html</a>
 */
public class JSONLicense extends License {
	
	public JSONLicense() {
		super("JSON License", JSONLicense.class.getResourceAsStream("/license/JSON License.txt"));
	}

}
