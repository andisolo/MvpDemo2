package com.guojiaming.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.guojiaming.mvpdemo.di.component.ActivityComponent;
import com.guojiaming.mvpdemo.di.component.DaggerActivityComponent;
import com.guojiaming.mvpdemo.presenter.BasePresenter;

import javax.inject.Inject;

/**
 * @author lenovo
 * Created on 2018-5-9.
 * @description
 */
public abstract class BaseActivity<V extends BaseView, P extends BasePresenter<V>> extends
		AppCompatActivity {
	@Inject
	P mP;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		bindPresenter();
		super.onCreate(savedInstanceState);
	}

	/**
	 * 绑定presenter子类必须实现此方法
	 */
	protected abstract void bindPresenter();

	protected ActivityComponent getComponent() {
		return DaggerActivityComponent.create();
	}

	protected P getPresenter() {
		return mP;
	}
}
