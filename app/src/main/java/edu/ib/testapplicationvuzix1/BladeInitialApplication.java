package edu.ib.testapplicationvuzix1;

import com.vuzix.hud.resources.DynamicThemeApplication;

/**
 * This app exist just to set them of all others right. It's mentioned in manifest as main but
 * serves no other purpose as far as i can tell.
 */
public class BladeInitialApplication extends DynamicThemeApplication{

    @Override
    protected int getNormalThemeResId() {
        return R.style.AppTheme;
    }

    @Override
    protected int getLightThemeResId() {
        return R.style.AppTheme_Light;
    }
}
