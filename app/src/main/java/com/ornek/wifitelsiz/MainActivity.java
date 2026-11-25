package com.ornek.wifitelsiz;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout ekran = new LinearLayout(this);
        ekran.setOrientation(LinearLayout.VERTICAL);
        ekran.setGravity(Gravity.CENTER);
        ekran.setPadding(25, 25, 25, 25);
        ekran.setBackgroundColor(Color.rgb(20, 35, 55));

        TextView baslik = new TextView(this);
        baslik.setText("📻 WIFI TELSİZ");
        baslik.setTextSize(28);
        baslik.setTextColor(Color.WHITE);
        baslik.setGravity(Gravity.CENTER);

        Button konus = new Button(this);
        konus.setText("BAS - KONUŞ");
        konus.setTextSize(25);

        TextView bilgi = new TextView(this);
        bilgi.setText("WiFi Telsiz hazır");
        bilgi.setTextColor(Color.WHITE);
        bilgi.setTextSize(18);
        bilgi.setGravity(Gravity.CENTER);

        ekran.addView(baslik);
        ekran.addView(konus, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 180));
        ekran.addView(bilgi);

        setContentView(ekran);
    }
}
