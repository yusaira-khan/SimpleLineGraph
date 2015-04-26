package com.yusaira_khan.simplelinegraph;


import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Yusaira on 4/17/2015.
 */
public class GraphView extends View {
    Canvas waveform;
    int width =100, height =100;

    GraphView(Context context){
        super(context);
    }
}
