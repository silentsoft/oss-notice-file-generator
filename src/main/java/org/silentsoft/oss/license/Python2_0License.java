package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Python 2.0 License
 *
 * @author silentsoft
 */
public class Python2_0License extends License {

    public Python2_0License() {
        super("Python-2.0", Python2_0License.class.getResourceAsStream("/license/Python-2.0.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "Python-2.0", "Python 2.0", "Python 2.0 License" };
    }

}
