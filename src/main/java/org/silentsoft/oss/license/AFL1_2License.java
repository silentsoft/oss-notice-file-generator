package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Academic Free License v1.2
 *
 * @author silentsoft
 */
public class AFL1_2License extends License {

    public AFL1_2License() {
        super("AFL-1.2", AFL1_2License.class.getResourceAsStream("/license/AFL-1.2.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "AFL-1.2", "AFL 1.2", "Academic Free License v1.2", "Academic Free License Version 1.2", "Academic Free License 1.2" };
    }

}
