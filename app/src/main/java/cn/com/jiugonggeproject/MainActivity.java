package cn.com.jiugonggeproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ShapeLocker.IShapeResult {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeLocker sl = findViewById(R.id.sl);
        sl.loadLightTheme();
        sl.setOnClickShapeResult(this);
    }

    @Override
    public void lockStr(String lockPsw) {
        Log.d("------------", "结果回调lockStr: " + lockPsw);
    }
}
