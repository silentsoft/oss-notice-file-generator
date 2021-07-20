package org.silentsoft.oss;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.TreeMap;

public class LicenseDictionaryTest {

    @Test
    public void validationTest() {
        Map<String, License> dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (License license : LicenseDictionary.getInstance().licenses) {
            String[] aliases = license.getAliases();
            if (aliases != null && aliases.length > 0) {
                for (String alias : aliases) {
                    if (dictionary.get(alias) != null) {
                        throw new RuntimeException(String.format("Alias '%s' already exists.", alias));
                    }
                    dictionary.put(alias, license);
                }
            }
        }
    }

    @Test
    public void putTest() {
        class DummyLicense extends License {
            DummyLicense() {
                super("Dummy", new ByteArrayInputStream(new byte[0]));
            }

            @Override
            public String[] getAliases() {
                return new String[]{ "DummyAlias" };
            }
        }

        Assert.assertNull(LicenseDictionary.get("Dummy"));
        Assert.assertNull(LicenseDictionary.get("DummyAlias"));

        int before = LicenseDictionary.getInstance().licenses.size();
        LicenseDictionary.put(new DummyLicense());
        int after = LicenseDictionary.getInstance().licenses.size();
        Assert.assertTrue(after > before);

        Assert.assertNotNull(LicenseDictionary.get("Dummy"));
        Assert.assertNotNull(LicenseDictionary.get("DummyAlias"));
    }

}
