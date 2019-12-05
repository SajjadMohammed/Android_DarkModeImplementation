package com.sajjad.darkmodeimplementation;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeConfigration {

    private SharedPreferences preferences;
    private String RES_ID = "resId";

    public ThemeConfigration(Context context) {
        preferences = context.getSharedPreferences("myTheme", Context.MODE_PRIVATE);
    }

    public void saveTheme(int resId) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(RES_ID, resId).apply();
    }

    public int getThemeId() {
        return preferences.getInt(RES_ID, 0);
    }
}
