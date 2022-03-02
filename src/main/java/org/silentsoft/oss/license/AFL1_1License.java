package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Academic Free License v1.1
 *
 * @author silentsoft
 */
public class AFL1_1License extends License {

    public AFL1_1License() {
        super("AFL-1.1", AFL1_1License.class.getResourceAsStream("/license/AFL-1.1.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "AFL-1.1", "AFL 1.1", "Academic Free License v1.1", "Academic Free License Version 1.1", "Academic Free License 1.1" };
    }

}
