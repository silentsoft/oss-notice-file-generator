package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Academic Free License v2.1
 *
 * @author silentsoft
 */
public class AFL2_1License extends License {

    public AFL2_1License() {
        super("AFL-2.1", AFL2_1License.class.getResourceAsStream("/license/AFL-2.1.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "AFL-2.1", "AFL 2.1", "Academic Free License v2.1", "Academic Free License Version 2.1", "Academic Free License 2.1" };
    }

}
