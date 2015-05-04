package com.oyty.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.oyty.residemenu.R;

/**
 * Created by oyty on 4/28/15.
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(initLayoutId());

        initHeadTitle();

        initView();

        initViewListener();
        
        process();
    }

    private void initHeadTitle() {
        TextView mHeadLeftAction = (TextView) findViewById(R.id.mHeadLeftAction);
        mHeadLeftAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleHeadLeftAction();
            }
        });
    }

    private void handleHeadLeftAction() {
        finish();
    }

    /**
     * 设置布局
     * @return
     */
    protected abstract int initLayoutId();

    /**
     * 初始化布局组件
     */
    protected abstract void initView();

    /**
     * 初始化组件监听事件
     */
    protected abstract void initViewListener();

    /**
     * 业务逻辑处理
     */
    protected abstract void process();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
