package cn.adair.tristana;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import cn.adair.oxframe.statusbar.OxStatusbar;
import cn.adair.tristana.basic.base.BaseActivity;

/**
 * @ClassName: LaunchActivity
 * @Package: cn.adair.tristana
 * @Description: 作用描述
 * @Author: Adair
 * @CreateDate: 2020/4/13 21:25
 **/
public class LaunchActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        OxStatusbar.setStatusBarColor(getWindow(), Color.parseColor("#FAFAFA"), 0);
        OxStatusbar.setDarkMode(getWindow());
    }

    @Override
    public int initLayout() {
        return R.layout.activity_launch;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    public void initMain(View view) {
        Intent intent = new Intent();
        intent.setClass(_mContext, LaunchActivitya.class);
        startActivity(intent);
    }

}
