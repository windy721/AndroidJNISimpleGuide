package com.jim.androidjnisimpleguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by a55 on 16/7/19.
 */
public class JNI extends Activity {
    static {
        System.loadLibrary("JniTest");
    }

    public native String getInitStringFromNative();
    public native String getGreetingFromNative();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni);
        System.out.println(getInitStringFromNative());
    }

    public void onClick(View pView) {
        Toast.makeText(this, getGreetingFromNative(), Toast.LENGTH_SHORT).show();
    }
}
