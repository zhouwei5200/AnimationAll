package com.android.jikexueyuan.animationall.property;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridLayout;

import com.android.jikexueyuan.animationall.R;

/**
 * Created by admin on 2015/11/30.
 */
public class LayoutAnimaActivity extends Activity implements
        CompoundButton.OnCheckedChangeListener {
    private ViewGroup viewGroup;
    private GridLayout mGridLayout;
    private int mVal;
    private LayoutTransition mTransition;
    private CheckBox mAppear, mChangeAppear, mDisAppear, mChangeDisAppear, mChange, mAppearself;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutanimation);
        viewGroup = (ViewGroup) findViewById(R.id.id_container);

        mAppear = (CheckBox) findViewById(R.id.id_appear);
        mChangeAppear = (CheckBox) findViewById(R.id.id_change_appear);
        mDisAppear = (CheckBox) findViewById(R.id.id_disappear);
        mChangeDisAppear = (CheckBox) findViewById(R.id.id_change_disappear);
        mChange = (CheckBox) findViewById(R.id.id_change_disappear);
        mAppearself = (CheckBox) findViewById(R.id.id_appear2);
        mAppear.setOnCheckedChangeListener(this);
        mChangeAppear.setOnCheckedChangeListener(this);
        mDisAppear.setOnCheckedChangeListener(this);
        mChangeDisAppear.setOnCheckedChangeListener(this);
        mChange.setOnCheckedChangeListener(this);
        mAppearself.setOnCheckedChangeListener(this);
        // 创建一个GridLayout
        mGridLayout = new GridLayout(this);
        // 设置每列5个按钮
        mGridLayout.setColumnCount(5);
        // 添加到布局中
        viewGroup.addView(mGridLayout);
        //默认动画全部开启
        mTransition = new LayoutTransition();
        mGridLayout.setLayoutTransition(mTransition);
        findViewById(R.id.addBtn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Button button = new Button(LayoutAnimaActivity.this);
                button.setText((++mVal) + "");
                mGridLayout.addView(button, Math.min(1, mGridLayout.getChildCount()));
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        mGridLayout.removeView(button);
                    }
                });
            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        mTransition = new LayoutTransition();
        mTransition.setAnimator(
                LayoutTransition.APPEARING,
                (mAppear.isChecked() ? mTransition
                        .getAnimator(LayoutTransition.APPEARING) : null));
        mTransition
                .setAnimator(
                        LayoutTransition.CHANGE_APPEARING,
                        (mChangeAppear.isChecked() ? mTransition
                                .getAnimator(LayoutTransition.CHANGE_APPEARING)
                                : null));
        mTransition.setAnimator(
                LayoutTransition.DISAPPEARING,
                (mDisAppear.isChecked() ? mTransition
                        .getAnimator(LayoutTransition.DISAPPEARING) : null));
        mTransition.setAnimator(
                LayoutTransition.CHANGE_DISAPPEARING,
                (mChangeDisAppear.isChecked() ? mTransition
                        .getAnimator(LayoutTransition.CHANGE_DISAPPEARING)
                        : null));
        mTransition.setAnimator(
                LayoutTransition.DISAPPEARING,
                (mChange.isChecked() ? mTransition
                        .getAnimator(LayoutTransition.CHANGING) : null));
        mTransition.setAnimator(
                LayoutTransition.APPEARING,
                (mAppearself.isChecked() ? ObjectAnimator.ofFloat(this, "scaleY", 0, 1) : null));


        mGridLayout.setLayoutTransition(mTransition);
    }
}

