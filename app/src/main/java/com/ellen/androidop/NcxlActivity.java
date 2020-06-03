package com.ellen.androidop;

import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;


public class NcxlActivity extends AppCompatActivity {

    private int a = 3;

    //这种情况下会导致内存泄漏
    //因为非静态内部类持有外部NcxlActivity的引用，导致Activity执行完onDestory时无法被及时回收，一直占据内存,
    //导致内存泄漏
    private Handler handler = new Handler(){

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            a = 4;
        }
    };


    /**
     * 这种方式既能解决内存泄漏问题，也能访问外部类的任何成员属性
     */
    private static class MyHandler extends Handler{

        private WeakReference<NcxlActivity> ncxlActivityWeakReference;

        MyHandler(NcxlActivity ncxlActivity){
            ncxlActivityWeakReference = new WeakReference<>(ncxlActivity);
        }

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            ncxlActivityWeakReference.get().a = 4;
        }
    }



}
