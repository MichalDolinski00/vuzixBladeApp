package edu.ib.testapplicationvuzix1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class MainMenuActivity extends ActionMenuActivity {

    // creates activity from given layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
    }

    // adds menu to activity from given layout
    @Override
    protected boolean onCreateActionMenu(Menu menu) {
        super.onCreateActionMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // menu always visible. (if set to false  Gesture (1 Finger hold for 1 second) needed)
    @Override
    protected boolean alwaysShowActionMenu() {
        return true;
    }

    // default first item on the menu
    @Override
    protected int getDefaultAction() {
        return 1;
    }

    public void startAuditoryActivity(MenuItem item)
    {
        startActivity(new Intent(this, AuditoryActivity.class));
    }

    public void startVisualActivity(MenuItem item)
    {
        startActivity(new Intent(this, VisualActivity.class));
    }

}
