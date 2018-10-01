package com.example.chayapa.homeworkii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textVName,textVAge,textVBF;
    Button back;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = (ImageView)findViewById(R.id.imageView2);
        textVName = (TextView)findViewById(R.id.textView1);
        textVAge = (TextView)findViewById(R.id.textView2);
        textVBF = (TextView)findViewById(R.id.textView3);

//       Intent intent = getIntent();  //รับค่าที่ส่งมาจากหน้าแรก
        Bundle bundle = getIntent().getExtras();

        Log.d("getdata","data"+bundle);

        String name = bundle.getString("name");
        String num = bundle.getString("number");
        String friend = bundle.getString("BFriend");

     //  int age = intent.getIntExtra("age",1);


        textVName.setText("Name = "+name);
        textVAge.setText("Age = "+num );
        textVBF.setText("Best Friend = "+friend);

        back = (Button)findViewById(R.id.button3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomain = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(gotomain);
            }
        });

    }
}
