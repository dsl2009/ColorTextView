package com.xair.cloud.colortextview.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by dsl_g on 2016-11-02.
 */


public class ColorTextView extends TextView{
    private ColorText colorText;
    public ColorTextView(Context context) {
        super(context);
    }

    public ColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setColorText(ColorText colorText){
      this.colorText=colorText;
        setText(colorText.getText());

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(colorText==null){
            return;
        }
        float totalLength=0;
        char[] str=colorText.getText().toCharArray();
        int[] colors=colorText.getColors();
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(getTextSize());
        paint.setColor(Color.BLUE);
        for(int i=0;i<str.length;i++){
            paint.setColor(colors[i]);
            canvas.drawText(str,i,1,totalLength,getHeight()-(getHeight()-getTextSize())/2,paint);

            if(str[i]<256){
                if((str[i]>=48&&str[i]<=58)||(str[i]>=97&&str[i]<=122)){
                    if(str[i]=='i'||str[i]=='j'||str[i]=='l'||str[i]=='t'||str[i]=='f'||str[i]=='r'||str[i]=='1'){
                        totalLength= totalLength+getTextSize()/4;
                    }else if(str[i]=='w'||str[i]=='m'){
                        totalLength= totalLength+getTextSize()/1.3f;
                    }else {
                        totalLength= totalLength+getTextSize()/2;
                    }
                }else if(str[i]<48||(str[i]>58&&str[i]<65)||(str[i]>90&&str[i]<97)||str[i]>122){
                    if(str[i]==','||str[i]=='.'||str[i]=='!'||str[i]==';'||str[i]=='/'||str[i]==']'||str[i]=='['||str[i]=='{'||str[i]=='}') {
                        totalLength = totalLength + getTextSize() / 3;
                    }
                    else {
                        totalLength= totalLength+getTextSize()/2;
                    }


                }
                if(str[i]>=65&&str[i]<=90){
                    if(str[i]=='I'){
                        totalLength= totalLength+getTextSize()/4f;
                    }else if(str[i]=='W'||str[i]=='M'){
                        totalLength= totalLength+getTextSize()/1.2f;
                    }else {
                        totalLength= totalLength+getTextSize()/1.7f;
                    }
                }
                if(i+1<str.length&&(str[i+1]==';'||str[i+1]==',')){
                    totalLength=totalLength+getTextSize()/10;
                }
                if(i+1<str.length&&(str[i+1]=='I')){
                    totalLength=totalLength+getTextSize()/10;
                }




            }else {
                totalLength= totalLength+getTextSize();
            }

        }


    }



}
