package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Academic Free License v3.0
 *
 * @author silentsoft
 */
public class AFL3_0License extends License {

    public AFL3_0License() {
        super("AFL-3.0", AFL3_0License.class.getResourceAsStream("/license/AFL-3.0.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "AFL-3.0", "AFL 3.0", "Academic Free License v3.0", "Academic Free License Version 3.0", "Academic Free License 3.0" };
    }

}
