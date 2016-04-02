package com.android.jikexueyuan.animationall.drawableanim;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.android.jikexueyuan.animationall.R;

/**
 * Created by admin on 2014/12/22.
 */
public class ShowExample extends Activity implements View.OnClickListener {
    private ImageView example;
    private AnimationDrawable frameAnim;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdrawableanim);

        example = (ImageView) findViewById(R.id.example);
        findViewById(R.id.anim1).setOnClickListener(this);
        findViewById(R.id.anim2).setOnClickListener(this);
        findViewById(R.id.anim3).setOnClickListener(this);
        findViewById(R.id.anim4).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        {
            example.setVisibility(View.GONE);
            example.setVisibility(View.VISIBLE);
            switch (v.getId()) {
                case R.id.anim1:
                    //TODO implement
                    example.setBackgroundResource(R.drawable.walk);
                    frameAnim = (AnimationDrawable) example.getBackground();
                    animation = new TranslateAnimation(-200, 200, 0, 0);
                    animation.setDuration(7000);
                    animation.setFillAfter(true);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            if (frameAnim != null && !frameAnim.isRunning()) {
                                //   frameAnim.start();
                                frameAnim.stop();
                            }

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    frameAnim.start();
                    example.startAnimation(animation);
                    break;
                case R.id.anim2:
                    example.setBackgroundResource(R.drawable.running);
                    frameAnim = (AnimationDrawable) example.getBackground();
                    animation = new TranslateAnimation(-200, 100, 0, 0);
                    animation.setDuration(3000);
                    animation.setFillAfter(true);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            if (frameAnim != null && !frameAnim.isRunning()) {
                                //   frameAnim.start();
                                frameAnim.stop();
                            }
                            example.setBackgroundResource(R.drawable.jump);
                            frameAnim = (AnimationDrawable) example.getBackground();
                            animation = new TranslateAnimation(100, 200, 0, 0);
                            animation.setDuration(1000);
                            animation.setFillAfter(true);
                            animation.setInterpolator(new LinearInterpolator());
                            frameAnim.start();
                            example.startAnimation(animation);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    frameAnim.start();
                    example.startAnimation(animation);
                    break;
                case R.id.anim3:
                    //TODO implement
                    example.setBackgroundResource(R.drawable.running);
                    frameAnim = (AnimationDrawable) example.getBackground();
                    animation = new TranslateAnimation(-200, 200, 0, 0);
                    animation.setDuration(4000);
                    animation.setFillAfter(true);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            if (frameAnim != null && !frameAnim.isRunning()) {
                                //   frameAnim.start();
                                frameAnim.stop();
                            }

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    frameAnim.start();
                    example.startAnimation(animation);

                    break;
                case R.id.anim4:

                    break;
            }
        }
    }
}

