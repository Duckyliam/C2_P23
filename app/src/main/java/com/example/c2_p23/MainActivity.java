package com.example.c2_p23;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void trafficlightening(View view){
        TextView light = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        OnClickListener clickListener = new OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(light.getText().toString().equals("RED")){
                    light.setText("YELLOW");
                    light.setTextColor(0xffffff00);
                    light.setBackgroundResource(R.color.yellow);
                }else
                if(light.getText().toString().equals("YELLOW")){
                    light.setText("GREEN");
                    light.setTextColor(0xff00FF00);
                    light.setBackgroundResource(R.color.green);
                }else
                {
                    light.setText("RED");
                    light.setTextColor(0xffff0000);
                    light.setBackgroundResource(R.color.red);

                }
            }
        };
        button.setOnClickListener(clickListener);
    }
}