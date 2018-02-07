package android.coolweather.com.gesturedetectorstu;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Mao on 2018/2/7.
 * OnDoubleTapListener:GestureDetector类中的一个接口,处理双击事件
 * 一次单击：onDown-》onSingleTapUp-》onSingleTapConfirmed-》||onDown-》onShowPress-》onSingleTapUp-》onSingleTapConfirmed
 * 一次双击：onDown-》onSingleTapUp-》onDoubleTap-》onDoubleTapEvent-》onDown-》onShowPress-》onDoubleTapEvent
 */

public class MyDoubleTapListener implements GestureDetector.OnDoubleTapListener {
    /*
    * Notified when a single-tap occurs.
    * @param e The down motion event of the single-tap.
    * @return true if the event is consumed, else false
     */
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d("MVE","onSingleTapConfirmed");
        return false;
    }
    /**
     * Notified when a double-tap occurs.
     * @param e The down motion event of the first tap of the double-tap.
     * @return true if the event is consumed, else false
     */
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.d("MVE","onDoubleTap");
        return false;
    }
    /**
     * Notified when an event within a double-tap gesture occurs, including
     * the down, move, and up events.
     * @param e The motion event that occurred during the double-tap gesture.
     * @return true if the event is consumed, else false
     */
    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.d("MVE","onDoubleTapEvent");
        return false;
    }
}
