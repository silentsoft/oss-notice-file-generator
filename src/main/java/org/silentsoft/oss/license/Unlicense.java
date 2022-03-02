package org.silentsoft.oss.license;

import org.silentsoft.oss.License;

/**
 * Unlicense
 *
 * @author silentsoft
 */
public class Unlicense extends License {

    public Unlicense() {
        super("Unlicense", Unlicense.class.getResourceAsStream("/license/Unlicense.txt"));
    }

    @Override
    public String[] getAliases() {
        return new String[] { "Unlicense", "Unlicense License", "The Unlicense", "The Unlicense License" };
    }

}
