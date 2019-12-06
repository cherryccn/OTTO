package com.hjy.otto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hjy.otto.fragment.LocationHistoryFragment;
import com.hjy.otto.fragment.MapFragment;
import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_clear_location).setOnClickListener(this);
        findViewById(R.id.btn_move_location).setOnClickListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.vs_map_container,new MapFragment());
        fragmentTransaction.replace(R.id.vs_history_container, new LocationHistoryFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commitNow();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //注册bus事件总线
        BusProvider.getInstance().register(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_clear_location://清除坐标
                break;
            case R.id.btn_move_location://移动坐标
                break;
        }
    }

//    @Subscribe
//    public void onActivityEvent(ActivityEvent event) {
//        Log.d("hjy", "onActivityEvent: " + event.getmEvent());
//    }

    @Override
    protected void onStop() {
        super.onStop();
        BusProvider.getInstance().unregister(this);
    }
}
