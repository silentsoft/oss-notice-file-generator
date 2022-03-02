package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Academic Free License v2.0
 *
 * @author silentsoft
 */
public class AFL2_0License extends License {

    public AFL2_0License() {
        super("AFL-2.0", AFL2_0License.class.getResourceAsStream("/license/AFL-2.0.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "AFL-2.0", "AFL 2.0", "Academic Free License v2.0", "Academic Free License Version 2.0", "Academic Free License 2.0" };
    }

}
