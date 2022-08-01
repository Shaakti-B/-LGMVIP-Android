package com.example.facedetection.Helper;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class RectOverlay extends GraphicOverlay.Graphic {
    private int mRectColor = Color.GREEN;
    private float mStrokesWidth = 4.0f;
    private Paint mRectPaint;
    private GraphicOverlay graphicOverlay;
    private Rect rect;

    public RectOverlay(GraphicOverlay graphicOverlay, Rect rect) {
        super(graphicOverlay);

        mRectPaint = new Paint();
        mRectPaint.setColor(mRectColor);
        mRectPaint.setStyle(Paint.Style.STROKE);
        mRectPaint.setStrokeWidth(mStrokesWidth);

        this.graphicOverlay = graphicOverlay;
        this.rect = rect;
    }

    @Override
    public void draw(Canvas canvas) {
        RectF rectf = new RectF(rect);
        rectf.left = translateX(rectf.left);
        rectf.right = translateX(rectf.right);
        rectf.top = translateX(rectf.top);
        rectf.bottom = translateX(rectf.bottom);

        canvas.drawRect(rectf, mRectPaint);
    }
}
