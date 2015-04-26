package com.yusaira_khan.simplelinegraph;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Yusaira on 4/17/2015.
 */
public class GraphView extends View {
    Canvas waveform;
    int width =100, height =100;

    Paint linePaint;
    Paint gridPaint;
    Paint backgroundPaint;
    Paint textPaint;
    Rect background;
    int minX =0, minY=0, maxX = 50, maxY;
    int[][] dataset;
    GraphView(Context context){
        super(context);
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //linePaint.setStyle(Paint.Style.FILL);
        linePaint.setARGB(255, 0, 0, 0);

        backgroundPaint = new Paint();
        backgroundPaint.setStyle(Paint.Style.FILL);
        backgroundPaint.setARGB(255,255,200,200);
        dataset=new int[maxX-minX][maxY-minY];
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        background = new Rect(0,0,w,h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawPaint(backgroundPaint);

        canvas.drawRect(background,backgroundPaint);
    }
}
