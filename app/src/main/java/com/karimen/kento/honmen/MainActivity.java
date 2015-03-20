package com.karimen.kento.honmen;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, new TopFragment())
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        int backStackCnt = getFragmentManager().getBackStackEntryCount();
        if (backStackCnt != 0) {
            getFragmentManager().popBackStack(); // BackStackに乗っているFragmentを戻す
        }



    }
}
