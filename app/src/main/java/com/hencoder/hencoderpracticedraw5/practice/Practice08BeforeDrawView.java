package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class Practice08BeforeDrawView extends AppCompatEditText {

    public Practice08BeforeDrawView(Context context) {
        super(context);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw(Canvas canvas) {
        // 在 super.draw() 的上方插入绘制代码，让绘制内容被其他所有内容盖住
        // 由于这期的重点是绘制代码的位置而不是绘制代码本身，所以直接给出绘制代码，你只要解除注释就好
//        canvas.drawColor(Color.parseColor("#66BB6A")); // 涂上绿色

        super.draw(canvas);
    }
}
