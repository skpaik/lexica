package com.serwylo.lexica.lang;

import java.util.Locale;

public class Spanish extends Language {
    @Override
    public boolean isBeta() {
        return true;
    }

    @Override
    public Locale getLocale() {
        return new Locale("es");
    }

    @Override
    public String getName() {
        return "es";
    }

    @Override
    public String toDisplay(String value) {
        return value.toUpperCase(getLocale());
    }

    @Override
    public String applyMandatorySuffix(String value) {
        return value;
    }
}
