package com.example.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;

public class HelloAppWidget extends AppWidgetProvider {

	@Override
	/**
	 * 利用可能になったときに呼び出されます
	 */
	public void onEnabled(Context context) {
		Log.i("APPWIDGET", "onEnabled()");
	}

	@Override
	/**
	 * システムからAppWidgetの更新の要求があったときに呼び出されます
	 */
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		Log.i("APPWIDGET", "onUpdate()");
	}
	
	@Override
	/**
	 * 利用不可になったときに呼び出されます
	 */
	public void onDisabled(Context context) {
		Log.i("APPWIDGET", "onDisabled()");
	}

	@Override
	/**
	 * 破棄される際に呼び出されます
	 */
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.i("APPWIDGET", "onDeleted()");
	}
}