package com.tap2skins.tap2skinssupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //click button, mở webview, load api, trả về site, đọc nội dung
        btnTest = findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SteamLoadingActivity.class);
                startActivity(intent);
                //deo beit dang lam gi nua
                //the thi dung lam nua
                //kho dung vl
            }
        });

    }
}
