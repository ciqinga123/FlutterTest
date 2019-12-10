package com.ciqing.test_flutter_aar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import io.flutter.app.FlutterFragmentActivity;
import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class FlutterMainActivity extends FlutterFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flutter);

        FlutterView main_flutter = Flutter.createView(this, getLifecycle(), "main_flutter");
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT);

        addContentView(main_flutter, params);
    }
}
