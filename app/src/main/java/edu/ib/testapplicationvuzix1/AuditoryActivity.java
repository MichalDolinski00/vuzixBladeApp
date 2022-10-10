package edu.ib.testapplicationvuzix1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class AuditoryActivity extends ActionMenuActivity {

    // media player for beep sound
    private MediaPlayer mp;
    private Handler handler = new Handler();
    private boolean running = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: change layout below to different, specifically for auditory activity
        setContentView(R.layout.main_menu_activity);

        // TODO: change sound to something that doesn't make me lose my mind after 2 sounds
        mp = MediaPlayer.create(this, R.raw.tone);


        handler.postDelayed(runnable, 2000);


    }

    private void start() {
        mp.start();
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        running = true;
    }

    // TODO: add a method to play sound every few seconds (by given amount om ms)
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (running) {
                start();
            }
        }
    };

}
