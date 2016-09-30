package com.tlf.basic.uikit.dialog.widget;

import android.content.Context;
import android.content.DialogInterface;

import com.tlf.basic.uikit.dialog.listener.OnOperItemClickL;


/**
 * Created by tanlifei on 16/8/19.
 */
public class ActionSheetTools {
    public  ActionSheetDialog sheetDialog = null;


    public ActionSheetTools getInstance(Context mContext,String[] stringItems) {
        sheetDialog = new ActionSheetDialog(mContext, stringItems, null);
        return this;
    }


    public ActionSheetTools widthScale(float widthScale){
        sheetDialog.widthScale(widthScale);
        return this;
    }

    public ActionSheetTools isTitleShow(boolean isTitleShow) {
        sheetDialog.isTitleShow(isTitleShow);
        return this;
    }

    public ActionSheetTools title(String title) {
        sheetDialog.title(title);
        return this;
    }



    public ActionSheetTools titleTextSize(int titleTextSize_PX) {
        sheetDialog.titleTextSize_PX(titleTextSize_PX);
        return this;
    }


    public ActionSheetTools show() {
        sheetDialog.show();
        return this;
    }

    public ActionSheetTools setOnOperItemClickL(OnOperItemClickL onOperItemClickL) {
        sheetDialog.setOnOperItemClickL(onOperItemClickL);
        return this;
    }

    public ActionSheetTools setOnDismissListener(DialogInterface.OnDismissListener listener){
        sheetDialog.setOnDismissListener(listener);
        return this;
    }

}
