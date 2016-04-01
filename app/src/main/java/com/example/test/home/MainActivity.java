package com.example.test.home;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.test.myapplication.R;

import until.ToastManager;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("fsaf");

        Log.e("dsa", "dsads");
        Build.getRadioVersion();// 获取手机的一些 信息
    }


    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void succes() {

    }

    @Override
    protected void faile() {
        ToastManager.showShortText(MainActivity.this,"请检查网络环境");
    }

    @Override
    public void onClick(View v) {

    }
//    private void InitDataList(String result){
//        try {
//            entity = JSON.parseObject(result,DataEntity.class);
//            list = entity.getList();
//            adapter = new MyAdapter(MainActivity.this,list);
//            System.out.println("===================="+entity);
//        } catch (Exception e) {
//            System.out.println("����ʧ����");
//        }
////		adapter.addData(list);
//        lv.setAdapter(adapter);
//    }
}
