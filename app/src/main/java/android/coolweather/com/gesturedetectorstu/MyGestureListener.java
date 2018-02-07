package android.coolweather.com.gesturedetectorstu;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Mao on 2018/2/7.
 * OnGestureListener：GestureDetector类中的一个接口
 *
 * 一次单击：onDown-》onShowPress-》onSingleTapUp
 * 一次长按：onDown-》onShowPress-》onLongPress
 * 一次快速滑动：onDown-》onScroll-》...-》onScroll-》onFling
 * 一次缓慢滑动：onDown-》onShowPress-》onScroll-》...-》onScroll
 */
public class MyGestureListener implements GestureDetector.OnGestureListener {
    //按下瞬间调用
    @Override
    public boolean onDown(MotionEvent e) {
        Log.d("MVE","onDown");
        return false;
    }
    //短按
    @Override
    public void onShowPress(MotionEvent e) {
        Log.d("MVE","onShowPress");
    }
    //抬起
    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.d("MVE","onSingleTapUp");
        return false;
    }
    //滚动
    /**
     * @param e1 The first down motion event that started the scrolling.
     * @param e2 The move motion event that triggered the current onScroll.
     * @param distanceX The distance along（沿着） the X axis（轴线） that has been scrolled since the last
     *              call to onScroll. This is NOT the distance between {@code e1}
     *              and {@code e2}.
     * @param distanceY The distance along the Y axis that has been scrolled since the last
     *              call to onScroll. This is NOT the distance between {@code e1}
     *              and {@code e2}.
     * @return true if the event is consumed（消费）, else false
     */
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d("MVE","onScroll");
         /*
        * eg:判断左滑还是右滑
        * */
        if((e1.getX()-e2.getX())>40){
            Log.d("MVE","Scroll左滑");
        }
        else if((e2.getX()-e1.getX())>40){
            Log.d("MVE","Scroll右滑");
        }
        return false;
    }
    //长按
    @Override
    public void onLongPress(MotionEvent e) {
        Log.d("MVE","onLongPress");
    }
    //快速滑动
    /*
    * @param e1 The first down motion event that started the fling.
    * @param e2 The move motion event that triggered the current onFling.
    * @param velocityX The velocity of this fling measured in pixels per second
    * along the x axis.
    * @param velocityY The velocity of this fling measured in pixels per second
    * along the y axis.
    * @return true if the event is consumed, else false
    */
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d("MVE","onFling");
        /*
        * eg:判断左滑还是右滑
        * */
        if((e1.getX()-e2.getX())>40){
            Log.d("MVE","快速左滑");
        }
        else if((e2.getX()-e1.getX())>40){
            Log.d("MVE","快速右滑");
        }
        return false;
    }
}
