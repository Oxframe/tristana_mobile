package cn.adair.tristana.basic.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @ClassName: BaseActivity
 * @Package: cn.adair.tristana.basic.base
 * @Description: 作用描述
 * @Author: Adair
 * @CreateDate: 2020/4/14 21:55
 **/
public abstract class BaseActivity extends AppCompatActivity implements BaseCallback {

    public Context _mContext;
    public Activity _mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        initView();
        initData(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        _mContext = this;
        _mActivity = this;
    }

}
