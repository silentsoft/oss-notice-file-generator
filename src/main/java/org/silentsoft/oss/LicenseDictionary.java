package org.silentsoft.oss;

import org.silentsoft.oss.license.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class LicenseDictionary {

    private Map<String, License> dictionary;

    List<License> licenses;

    private LicenseDictionary() {
        dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        licenses = new ArrayList<>();
        licenses.add(new ApacheLicense2_0());
        licenses.add(new BCLLicense());
        licenses.add(new BSD2ClauseLicense());
        licenses.add(new BSD3ClauseLicense());
        licenses.add(new BSDZeroClauseLicense());
        licenses.add(new CCBY3_0License());
        licenses.add(new CCBY4_0License());
        licenses.add(new CCZero1_0License());
        licenses.add(new CDDL1_1License());
        licenses.add(new EDL1_0License());
        licenses.add(new EPL1_0License());
        licenses.add(new EPL2_0License());
        licenses.add(new GPL2_0CELicense());
        licenses.add(new GPL2_0License());
        licenses.add(new GPL3_0License());
        licenses.add(new ICULicense());
        licenses.add(new ISCLicense());
        licenses.add(new JSONLicense());
        licenses.add(new LGPL2_1License());
        licenses.add(new LGPL3_0License());
        licenses.add(new MITLicense());
        licenses.add(new MPL1_1License());
        licenses.add(new MPL2_0License());
        licenses.add(new ODCBy1_0License());
        licenses.add(new WTFPLLicense());
        licenses.add(new ZlibLicense());

        generateAliases();
    }

    private void generateAliases() {
        dictionary.clear();

        for (License license : licenses) {
            dictionary.put(license.getName(), license);

            String[] aliases = license.getAliases();
            if (aliases != null && aliases.length > 0) {
                for (String alias : aliases) {
                    dictionary.put(alias, license);
                }
            }
        }
    }

    public static License get(String nameOrAlias) {
        return getInstance().dictionary.get(nameOrAlias);
    }

    public static void put(License... licenses) {
        if (licenses == null || licenses.length == 0) {
            return;
        }

        LicenseDictionary licenseDictionary = getInstance();
        for (License license : licenses) {
            if (licenseDictionary.licenses.contains(license) == false) {
                licenseDictionary.licenses.add(license);
            }
        }
        licenseDictionary.generateAliases();
    }

    private static LicenseDictionary instance;
    static LicenseDictionary getInstance() {
        if (instance == null) {
            instance = new LicenseDictionary();
        }
        return instance;
    }

}
