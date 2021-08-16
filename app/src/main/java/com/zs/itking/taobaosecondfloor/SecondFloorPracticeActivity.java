package com.zs.itking.taobaosecondfloor;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/**
 * created by on 2021/8/16
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-16-20:28
 */
public class SecondFloorPracticeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_second_floor);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_show,new SecondFloorPracticeFragment()).commit();
    }
}
