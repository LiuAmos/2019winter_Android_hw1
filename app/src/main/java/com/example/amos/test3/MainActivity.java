package com.example.amos.test3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private Button btm1;
    private int int_counter=0;
    private String str="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btm1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.textView1);
//        text1.setText("嘿嘿嘿");

        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int_counter=int_counter+1;
                str=Integer.toString(int_counter);
                text1.setText("點了"+str+"次");
            }
        });

    }
}
