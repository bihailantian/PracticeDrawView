package com.xxm.practicedrawview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;



public class PracticeDraw1View extends View {


    private Paint mPaint;

    public PracticeDraw1View(Context context) {
        super(context);
        init();
    }

    public PracticeDraw1View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PracticeDraw1View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(){
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.parseColor("#009688"));

        canvas.drawRect(30, 30, 230, 180, mPaint);

        mPaint.setColor(Color.parseColor("#FF9800"));
        mPaint.setStrokeWidth(3);
        canvas.drawLine(300, 30, 450, 180, mPaint);

        mPaint.setColor(Color.parseColor("#E91E63"));
        mPaint.setTextSize(22);
        canvas.drawText("HenCoder", 500, 130, mPaint);
    }
}
