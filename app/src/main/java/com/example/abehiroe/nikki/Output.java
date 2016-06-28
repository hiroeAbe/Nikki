package com.example.abehiroe.nikki;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by abehiroe on 2016/06/25.
 */
public class Output extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);



        Button button2 = (Button)findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.abehiroe.nikki", "com.example.abehiroe.nikki.MainActivity");
                startActivity(intent);
            }
        });

    }
}
