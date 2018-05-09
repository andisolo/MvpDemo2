package com.guojiaming.mvpdemo.di.component;

import com.guojiaming.mvpdemo.MainActivity;
import com.guojiaming.mvpdemo.di.module.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author lenovo
 * Created on 2018-5-9.
 * @description
 */
@Singleton
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
	/**
	 * 绑定activity
	 *
	 * @param activity 需要注入的activity
	 */
	void inject(MainActivity activity);
}
