package com.guojiaming.mvpdemo;

import android.os.Bundle;

import com.guojiaming.mvpdemo.presenter.MainPresenter;
import com.guojiaming.mvpdemo.view.BaseActivity;
import com.guojiaming.mvpdemo.view.MainView;

/**
 * @author lenovo
 */
public class MainActivity extends BaseActivity<MainView, MainPresenter> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void bindPresenter() {
		getComponent().inject(this);
	}
}
