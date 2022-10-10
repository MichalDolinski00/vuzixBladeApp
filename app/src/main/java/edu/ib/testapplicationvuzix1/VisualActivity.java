package edu.ib.testapplicationvuzix1;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class VisualActivity extends ActionMenuActivity {

    private ImageView image;
    private AnimatedVectorDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: change layout below to different, specifically for auditory activity
        setContentView(R.layout.visual);
        image = (ImageView) findViewById(R.id.animation);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Drawable d = image.getDrawable();
        if (d instanceof AnimatedVectorDrawable) {
            animation = (AnimatedVectorDrawable) d;
            animation.start();
        }
    }
}
