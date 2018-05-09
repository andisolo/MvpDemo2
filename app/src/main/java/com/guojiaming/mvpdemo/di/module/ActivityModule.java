package com.guojiaming.mvpdemo.di.module;

import com.guojiaming.mvpdemo.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author lenovo
 * Created on 2018-5-9.
 * @description
 */
@Module
public class ActivityModule {

	@Singleton
	@Provides
	MainPresenter getMainPresenter() {
		return new MainPresenter();
	}
}
