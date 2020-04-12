package com.adair.tristana;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import cn.adair.oxframe.custom.OxTitlebar;
import cn.adair.oxframe.utils.KeyboardCompat;

/**
 * Created by liufei on 2017/8/29.
 */

public class QuickPreviewActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_preview);
        ((OxTitlebar) findViewById(R.id.titlebar)).setListener(new OxTitlebar.OnTitleBarListener() {
            @Override
            public void onClicked(View v, int action, String extra) {
                if (action == OxTitlebar.ACTION_LEFT_TEXT) {
                    onBackPressed();
                }
            }
        });
        ((OxTitlebar) findViewById(R.id.titlebar_3)).showCenterProgress();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        KeyboardCompat.assistWindow(getWindow());
    }
}
