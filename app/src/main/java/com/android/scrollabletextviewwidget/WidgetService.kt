package com.android.scrollabletextviewwidget

import android.content.Intent
import android.widget.RemoteViewsService

class WidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent): RemoteViewsFactory {
        return ListProvider(this.applicationContext, intent)
    }

    companion object {
        const val CONTENT = "content"
    }
}