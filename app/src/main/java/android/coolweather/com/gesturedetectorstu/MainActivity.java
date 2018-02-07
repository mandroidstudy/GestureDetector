package android.coolweather.com.gesturedetectorstu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
/*GestureDetector：使用步骤
* 1、当点击或滑动屏幕时会被View.OnTouchListener的onTouch方法捕获，并封装到MotionEvent对象中。
* 2、实例化GestureDetector，调用其onTouchEvent()方对MotionEvent对象进行处理，并转发给GestureListener
* 3、在GestureListener中相应的方法里进行相应的操作
* */
public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private ImageView imageView;
    private GestureDetector mGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.image_view);

         /* 转发给OnGestureListener
          * mGestureDetector=new GestureDetector(this,new MyGestureListener());
          */

        /* 转发给OnDoubleTapListener
        *  mGestureDetector=new GestureDetector(this,new MyGestureListener());
        *  mGestureDetector.setOnDoubleTapListener(new MyDoubleTapListener());
        * */
        mGestureDetector=new GestureDetector(this,new MySimpleOnGestureListener());

        imageView.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }
}
