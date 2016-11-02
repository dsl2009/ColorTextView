package com.xair.cloud.colortextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xair.cloud.colortextview.ui.ColorText;
import com.xair.cloud.colortextview.ui.ColorTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorTextView tv1= (ColorTextView) findViewById(R.id.tv1);
        ColorTextView tv2= (ColorTextView) findViewById(R.id.tv2);
        ColorTextView tv3= (ColorTextView) findViewById(R.id.tv3);
        ColorTextView tv4= (ColorTextView) findViewById(R.id.tv4);


        ColorText t1=new ColorText("红橙黄绿青蓝紫");
        int[] colors={0xffff0000,0xfffb8c00, Color.YELLOW,Color.GREEN,0xff18ffff,Color.BLUE,0xff9c27b0};
        t1.setColors(colors);
        tv1.setColorText(t1);

        ColorText t2=new ColorText("{dasjkjuiiw,.}[]djaksj");
        t2.setIndexColor(5,Color.RED);
        tv2.setColorText(t2);

        ColorText t3=new ColorText("hello this is for test");
        t3.setIndexColor(5,10,Color.BLUE);
        tv3.setColorText(t3);


        ColorText t4=new ColorText("daisjjodapwepwq;");
        t4.setStartEndColor(0,t4.getText().length()-3,Color.RED);
        tv4.setColorText(t4);

    }
}
