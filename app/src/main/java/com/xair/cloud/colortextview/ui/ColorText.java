package com.xair.cloud.colortextview.ui;

/**
 * Created by dsl_g on 2016-11-02.
 */

public class ColorText {
    private String text;
    private int[] colors;


    public ColorText(String text, int[] colors) {
        this.text = text;
        this.colors = colors;
    }

    public ColorText(String text) {
        this.text = text;
        char[] data=text.toCharArray();
        colors=new int[data.length];
        for(int i=0;i<data.length;i++){

            colors[i]=0xff444444;

        }

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void setDefaultColor(int color){
        char[] data=text.toCharArray();
        for(int i=0;i<data.length;i++){

            colors[i]=color;

        }

    }
    public void setIndexColor(int index,int color){
        if(index<colors.length){
            colors[index]=color;
        }


    }
    public void setIndexColor(int index,int count,int color){
        if(index+count<colors.length){
           for(int i=index;i<index+count;i++){
               colors[i]=color;
           }
        }
    }

    public void setStartEndColor(int start,int end,int color){
        if(start<colors.length&&end<colors.length&&start<end){
            for(int i=start;i<end;i++){
                colors[i]=color;
            }
        }
    }
    public int[] getColors() {
        return colors;
    }

    public void setColors(int[] colors) {
        this.colors = colors;
    }
}
