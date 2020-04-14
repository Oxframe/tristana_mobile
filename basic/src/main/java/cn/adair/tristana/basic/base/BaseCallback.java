package cn.adair.tristana.basic.base;

import android.os.Bundle;

/**
 * @ClassName: BaseCallback
 * @Package: cn.adair.tristana.basic.base
 * @Description: 作用描述
 * @Author: Adair
 * @CreateDate: 2020/4/14 21:58
 **/
public interface BaseCallback {

    /**
     * 布局id
     */
    int initLayout();

    /**
     * 初始化布局控件
     */
    void initView();

    /**
     * 初始化数据
     */
    void initData(Bundle savedInstanceState);

}
