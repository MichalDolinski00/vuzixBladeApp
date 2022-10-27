package edu.ib.testapplicationvuzix1;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class VisualActivity extends ActionMenuActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visual_new);
        image = findViewById(R.id.imageview);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.blinking);
        image.startAnimation(animation);
    }
}
