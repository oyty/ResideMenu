package com.oyty.ui.activity;

import android.view.KeyEvent;

import com.oyty.base.BaseActivity;
import com.oyty.residemenu.R;
import com.oyty.ui.widget.ResideMenu;

public class MainActivity extends BaseActivity {
	private ResideMenu mResideMenuLayout;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initResideMenu();

    }

    @Override
    protected void initViewListener() {

    }

    @Override
    protected void process() {

    }

    /**
     * 初始化侧滑菜单
     */
    private void initResideMenu() {
        mResideMenuLayout = (ResideMenu) findViewById(R.id.mResideMenuLayout);
        // 设置侧滑菜单背景
        mResideMenuLayout.setBackgroundResource(R.drawable.menu_background);
        // 设置侧滑菜单右内边距，默认为50dp
        mResideMenuLayout.setMenuRightPadding(100);
        // 设置阴影的宽度，根据阴影图片自行调试
        mResideMenuLayout.setMenuShadowWidth(12);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 点击返回的时候，如果菜单处于打开状态，则先关闭菜单
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            if(mResideMenuLayout.isOpen()) {
                mResideMenuLayout.toggle();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
