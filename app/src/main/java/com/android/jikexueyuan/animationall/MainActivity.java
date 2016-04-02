package com.android.jikexueyuan.animationall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.android.jikexueyuan.animationall.drawableanim.ShowDrawableAnim;
import com.android.jikexueyuan.animationall.drawableanim.ShowExample;
import com.android.jikexueyuan.animationall.drawableanim.TestInterpolator;
import com.android.jikexueyuan.animationall.property.DingZhi;
import com.android.jikexueyuan.animationall.property.LayoutAnimaActivity;
import com.android.jikexueyuan.animationall.property.ShowProperty;
import com.android.jikexueyuan.animationall.property.ViewAnimateActivity;
import com.android.jikexueyuan.animationall.tween.AllTween;
import com.android.jikexueyuan.animationall.tween.ShowMain;
import com.android.jikexueyuan.animationall.tween.ShowTween;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.showmain).setOnClickListener(this);
        findViewById(R.id.showtween).setOnClickListener(this);
        findViewById(R.id.alltween).setOnClickListener(this);
        findViewById(R.id.showdrawableanim).setOnClickListener(this);
        findViewById(R.id.interpolatershow).setOnClickListener(this);
        findViewById(R.id.tweendrawableanim).setOnClickListener(this);
        findViewById(R.id.propertyanim).setOnClickListener(this);
        findViewById(R.id.propertydef).setOnClickListener(this);
        findViewById(R.id.viewproperty).setOnClickListener(this);
        findViewById(R.id.layoutanim).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.showmain:
                //TODO implement
                startActivity(new Intent(MainActivity.this, ShowMain.class));
                break;
            case R.id.showtween:
                //TODO implement
                startActivity(new Intent(MainActivity.this, ShowTween.class));
                break;
            case R.id.alltween:
                //TODO implement
                startActivity(new Intent(MainActivity.this, AllTween.class));
                break;
            case R.id.showdrawableanim:
                startActivity(new Intent(MainActivity.this, ShowDrawableAnim.class));
                break;
            case R.id.interpolatershow:
                startActivity(new Intent(MainActivity.this, TestInterpolator.class));
                break;
            case R.id.tweendrawableanim:
                startActivity(new Intent(MainActivity.this, ShowExample.class));
                break;
            case R.id.propertyanim:
                startActivity(new Intent(MainActivity.this, ShowProperty.class));
                break;
            case R.id.propertydef:
                startActivity(new Intent(MainActivity.this, DingZhi.class));
                break;
            case R.id.viewproperty:
                startActivity(new Intent(MainActivity.this, ViewAnimateActivity.class));
                break;
            case R.id.layoutanim:
                startActivity(new Intent(MainActivity.this, LayoutAnimaActivity.class));
                break;


        }
    }
}
