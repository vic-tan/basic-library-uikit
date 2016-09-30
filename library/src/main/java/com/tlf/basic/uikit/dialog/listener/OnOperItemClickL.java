package com.tlf.basic.uikit.dialog.listener;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;

public interface OnOperItemClickL {
		void onOperItemClick(Dialog dialog, AdapterView<?> parent, View view, int position, long id);
	}
