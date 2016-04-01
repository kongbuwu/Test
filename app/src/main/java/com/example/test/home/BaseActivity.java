package com.example.test.home;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.test.myapplication.R;

import java.util.zip.Inflater;

import until.NetUtils;

/**
 * Created by xtl on 2016/3/25.
 * 基类
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener{
    private FrameLayout fl;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
        initView();
        initListener();

        if( NetUtils.isConnected(BaseActivity.this)==true){
            succes();
        }else{
            faile();
        }
    }

    private  void init(){
    fl = (FrameLayout) findViewById(R.id.parentLayout);
        View view = LayoutInflater.from(this).inflate(getlayout(),fl);
    };
    protected abstract int getlayout();
    protected abstract void initView();
    protected abstract void initListener();
    protected abstract void succes();
    protected abstract void faile();
}
