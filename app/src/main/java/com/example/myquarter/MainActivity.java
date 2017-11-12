package com.example.myquarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myquarter.base.BaseActivity;
import com.example.myquarter.base.BaseMvpActivity;
import com.example.myquarter.base.BasePresenter;

public class MainActivity extends BaseMvpActivity{


    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void bt(View view) {
        gotoActivity(HomeActivity.class);
    }
}
