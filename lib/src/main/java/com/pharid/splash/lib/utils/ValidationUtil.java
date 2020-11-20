package com.pharid.splash.lib.utils;

import com.pharid.splash.lib.cnst.Flags;
import com.pharid.splash.lib.model.ConfigSplash;

public class ValidationUtil {

    public static int hasPath(ConfigSplash cs) {
        if (cs.getPathSplash().isEmpty())
            return Flags.WITH_LOGO;
        else
            return Flags.WITH_PATH;
    }
}
