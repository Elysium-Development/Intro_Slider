package com.elysium.introsliderdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jay on 3/27/17.
 */

public class IntroManager {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    public IntroManager(Context context) {

        this.context = context;
        preferences = context.getSharedPreferences("first", 0);
        editor = preferences.edit();
    }

    public void setFirst(Boolean isFirst) {

        editor.putBoolean("check", isFirst);
        editor.commit();
    }

    public boolean Check() {

        return preferences.getBoolean("check", true);
    }
}
