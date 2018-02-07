package android.coolweather.com.gesturedetectorstu;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Mao on 2018/2/7.
 * SimpleOnGestureListener:GestureDetector类中的静态类，实现了OnGestureListener、
 *                         OnDoubleTapListener、OnContextClickListener监听器
 */

public class MySimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener {
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d("MVE","onFling");
        /*
        * eg:判断左滑还是右滑
        * */
        if((e1.getX()-e2.getX())>40){
            Log.d("MVE","左滑");
        }
        else if((e2.getX()-e1.getX())>40){
            Log.d("MVE","右滑");
        }
        return false;
    }
}
