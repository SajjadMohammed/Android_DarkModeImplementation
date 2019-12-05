package com.sajjad.darkmodeimplementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar mainToolbar;
    ThemeConfigration themeConfigration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkTheme();
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void checkTheme() {
        themeConfigration = new ThemeConfigration(this);
        int resId = themeConfigration.getThemeId();
        if (resId == 0) {
            setTheme(R.style.AppTheme);
        } else {
            setTheme(resId);
        }
    }

    private void initViews() {
        mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);
    }

    public void activateDarkMode(View view) {
        themeConfigration.saveTheme(R.style.DarkTheme);
        recreate();
    }

    public void activateDefaultMode(View view) {
        themeConfigration.saveTheme(R.style.AppTheme);
        recreate();
    }
}