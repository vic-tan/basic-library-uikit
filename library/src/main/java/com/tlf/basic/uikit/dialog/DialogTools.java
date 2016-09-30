package com.tlf.basic.uikit.dialog;

import android.content.Context;
import android.content.DialogInterface;

import com.tlf.basic.uikit.dialog.listener.OnBtnClickL;
import com.tlf.basic.uikit.dialog.widget.NormalDialog;


/**
 * Created by tanlifei on 16/8/19.
 */
public class DialogTools {
    private static NormalDialog dialog = null;
    private static volatile DialogTools instance = null;


    public static DialogTools getInstance(Context mContext) {
        if (instance == null) {
            synchronized (DialogTools.class) {
                if (instance == null) {
                    instance = new DialogTools();
                    dialog = new NormalDialog(mContext);
                    //dialog.titleLineColor(Color.parseColor("#222222"));
                    //dialog.dividerColor(Color.parseColor("#222222"));
                }
            }
        }
        return instance;
    }


    public DialogTools widthScale(float widthScale){
        dialog.widthScale(widthScale);
        return this;
    }

    public DialogTools isTitleShow(boolean isTitleShow) {
        dialog.isTitleShow(isTitleShow);
        return this;
    }

    public DialogTools title(String title) {
        dialog.title(title);
        return this;
    }

    public DialogTools btnNum(int btnNum) {
        dialog.btnNum(btnNum);
        return this;
    }

    public DialogTools titleTextSize(int titleTextSize_PX) {
        dialog.titleTextSize(titleTextSize_PX);
        return this;
    }


    public DialogTools content(String content) {
        dialog.content(content);
        return this;
    }

    public DialogTools show() {
        dialog.show();
        return this;
    }

    public DialogTools btnText(String... btnText) {
        dialog.btnText(btnText);
        return this;
    }

    public DialogTools btnTextSize(float... btnTextSizes) {
        dialog.btnTextSize(btnTextSizes);
        return this;
    }


    public DialogTools btnTextColor(int... btnTextColors) {
        dialog.btnTextColor(btnTextColors);
        return this;
    }

    public DialogTools btnPressColor(int btnPressColor){
        dialog.btnPressColor(btnPressColor);
        return this;
    }

    public DialogTools cornerRadius(int cornerRadius){
        dialog.cornerRadius(cornerRadius);
        return this;
    }

    public DialogTools contentTextColor(int contentTextColor){
        dialog.contentTextColor(contentTextColor);
        return this;
    }

    public DialogTools dividerColor(int dividerColor){
        dialog.dividerColor(dividerColor);
        return this;
    }

    public DialogTools contentGravity(int contentGravity){
        dialog.contentGravity(contentGravity);
        return this;
    }

    public DialogTools setOnBtnClickL(OnBtnClickL... onBtnClickLs) {
        dialog.setOnBtnClickL(onBtnClickLs);
        return this;
    }

    public DialogTools setOnDismissListener(DialogInterface.OnDismissListener listener){
        dialog.setOnDismissListener(listener);
        return this;
    }

}
