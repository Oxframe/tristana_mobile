package cn.adair.tristana;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import cn.adair.oxframe.statusbar.OxStatusbar;

/**
 * @ClassName: LaunchActivity
 * @Package: cn.adair.tristana
 * @Description: 作用描述
 * @Author: Adair
 * @CreateDate: 2020/4/13 21:25
 **/
public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        OxStatusbar.setStatusBarColor(getWindow(), Color.parseColor("#FAFAFA"), 0);
        OxStatusbar.setDarkMode(getWindow());
    }
}
