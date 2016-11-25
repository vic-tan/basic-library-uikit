package com.tlf.basic.uikit.dialog.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.TextView;

import com.tlf.basic.base.autolayout.utils.AutoUtils;
import com.tlf.basic.uikit.R;
import com.tlf.basic.uikit.dialog.WidthScaleConstants;
import com.tlf.basic.uikit.dialog.base.dialog.BaseDialog;
import com.tlf.basic.uikit.utils.UikitCornerUtils;


/**
 * 自定义发现新的版本的提示框
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public abstract class NormalScrollViewDialog extends BaseDialog<NormalScrollViewDialog> {
    private TextView mTvOk, mTvExit;
    private TextView mTvContent;

    public NormalScrollViewDialog(Context context) {
        super(context);
    }


    @Override
    public View onCreateView() {
        widthScale(WidthScaleConstants.DIALOG_NORMAL_DIALOG_SCALE);
        View inflate = View.inflate(mContext, R.layout.common_dialog_normal_scroll_view, null);
        AutoUtils.autoSize(inflate);
        mTvContent = (TextView) inflate.findViewById(R.id.tv_content);
        mTvContent.setLineSpacing(0, WidthScaleConstants.DIALOG_WONDWON_CONTENT_LINE_SPACING);
        mTvOk = (TextView) inflate.findViewById(R.id.tv_ok);
        mTvExit = (TextView) inflate.findViewById(R.id.tv_exit);
        setSelector(mTvOk);
        setSelector(mTvExit);
        inflate.setBackground(UikitCornerUtils.cornerDrawable(Color.parseColor("#ffffff"), mContext.getResources().getDimension(R.dimen.common_border_radius)));
        return inflate;
    }

    public void setSelector(TextView v) {
        v.setBackground(UikitCornerUtils.btnSelector((int) mContext.getResources().getDimension(R.dimen.common_border_radius), Color.parseColor("#ffffff"), Color.parseColor("#E3E3E3"), -2));
    }


    public TextView getmTvOk() {
        return mTvOk;
    }

    public TextView getmTvContent() {
        return mTvContent;
    }

    public TextView getmTvExit() {
        return mTvExit;
    }
}
