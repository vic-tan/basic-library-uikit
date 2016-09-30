package com.tlf.basic.uikit.dialog.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tlf.basic.base.autolayout.AutoLinearLayout;
import com.tlf.basic.uikit.R;
import com.tlf.basic.uikit.dialog.internal.BaseAlertDialog;
import com.tlf.basic.utils.CornerUtils;


@SuppressWarnings("deprecation")
public class NormalDialog extends BaseAlertDialog<NormalDialog> {

    /**
     * title underline
     */
    private View mVLineTitle;
    /**
     * vertical line between btns
     */
    private View mVLineVertical;
    /**
     * vertical line between btns
     */
    private View mVLineVertical2;
    /**
     * horizontal line above btns
     */
    private View mVLineHorizontal;
    /**
     * title underline color(标题下划线颜色)
     */
    private int mTitleLineColor ;
    /**
     * title underline height(标题下划线高度)
     */
    private float mTitleLineHeight ;

    /**
     * btn divider line color(对话框之间的分割线颜色(水平+垂直))
     */
    private int mDividerColor ;




    public NormalDialog(Context context) {
        super(context);
        mTitleLineColor = context.getResources().getColor(R.color.common_prompt_dialog_title_line);
        mTitleLineHeight = context.getResources().getDimension(R.dimen.common_prompt_dialog_title_btn_split_line_size);
        mDividerColor = context.getResources().getColor(R.color.common_prompt_dialog_content_btn_line);
        /** default value*/
        mTitleTextColor = context.getResources().getColor(R.color.common_prompt_dialog_title_color);
        mTitleTextSize = context.getResources().getDimension(R.dimen.common_dialog_title_size);
        mContentTextColor = context.getResources().getColor(R.color.common_prompt_dialog_content);
        mContentTextSize = context.getResources().getDimension(R.dimen.common_dialog_content_size);
        mLeftBtnTextColor = context.getResources().getColor(R.color.common_prompt_dialog_btn);
        mRightBtnTextColor = context.getResources().getColor(R.color.common_prompt_dialog_btn);
        mMiddleBtnTextColor = context.getResources().getColor(R.color.common_prompt_dialog_btn);
        /** default value*/
    }

    @Override
    public View onCreateView() {
        mLlContainer = (AutoLinearLayout) LayoutInflater.from(mContext).inflate(R.layout.common_dialog_normal,null);
        /** title */
        mTvTitle = (TextView) mLlContainer.findViewById(R.id.mTvTitle);
        mVLineTitle = mLlContainer.findViewById(R.id.mVLineTitle);

        /** content */
        mTvContent = (TextView) mLlContainer.findViewById(R.id.mTvContent);
        mVLineHorizontal = mLlContainer.findViewById(R.id.mVLineHorizontal);
        /**btns*/
        mTvBtnLeft =(TextView) mLlContainer.findViewById(R.id.mTvBtnLeft);
        mTvBtnMiddle = (TextView) mLlContainer.findViewById(R.id.mTvBtnMiddle);
        mTvBtnRight = (TextView) mLlContainer.findViewById(R.id.mTvBtnRight);

        mVLineVertical = mLlContainer.findViewById(R.id.mVLineVertical);
        mVLineVertical2 = mLlContainer.findViewById(R.id.mVLineVertical2);
        return mLlContainer;
    }

    @Override
    public void setUiBeforShow() {
        super.setUiBeforShow();
        /** title underline */
        mVLineTitle.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,(int)mTitleLineHeight));
        mVLineTitle.setBackgroundColor(mTitleLineColor);
        mVLineTitle.setVisibility(mIsTitleShow ? View.VISIBLE : View.GONE);

        /** btns */
        mVLineHorizontal.setBackgroundColor(mDividerColor);
        mVLineVertical.setBackgroundColor(mDividerColor);
        mVLineVertical2.setBackgroundColor(mDividerColor);

        if (mBtnNum == 1) {
            mTvBtnLeft.setVisibility(View.GONE);
            mTvBtnRight.setVisibility(View.GONE);
            mVLineVertical.setVisibility(View.GONE);
            mVLineVertical2.setVisibility(View.GONE);
        } else if (mBtnNum == 2) {
            mTvBtnMiddle.setVisibility(View.GONE);
            mVLineVertical.setVisibility(View.GONE);
        }

        /**set background color and corner radius */
        mTvBtnLeft.setBackgroundDrawable(CornerUtils.btnSelector(mCornerRadius, mBgColor, mBtnPressColor, 0));
        mTvBtnRight.setBackgroundDrawable(CornerUtils.btnSelector(mCornerRadius, mBgColor, mBtnPressColor, 1));
        mTvBtnMiddle.setBackgroundDrawable(CornerUtils.btnSelector(mBtnNum == 1 ? mCornerRadius : 0, mBgColor, mBtnPressColor, -1));
        mOnCreateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



    /**
     * set title underline color(设置标题下划线颜色)
     */
    public NormalDialog titleLineColor(int titleLineColor) {
        this.mTitleLineColor = titleLineColor;
        return this;
    }

    /**
     * set title underline height(设置标题下划线高度)
     */
    public NormalDialog titleLineHeight(float titleLineHeight_PX) {
        this.mTitleLineHeight = titleLineHeight_PX;
        return this;
    }

    /**
     * set divider color between btns(设置btn分割线的颜色)
     */
    public NormalDialog dividerColor(int dividerColor) {
        this.mDividerColor = dividerColor;
        return this;
    }
}
