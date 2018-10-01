package com.example.chayapa.homeworkii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTAge,editTName,editTBF;
    TextView textVName,textVAge,textVBF,textVTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTAge = (EditText) findViewById(R.id.etAge);
        editTBF = (EditText) findViewById(R.id.etBF);
        editTName = (EditText)findViewById(R.id.etName);
        textVName = (TextView)findViewById(R.id.textView);
        textVAge = (TextView)findViewById(R.id.textView4);
        textVBF = (TextView)findViewById(R.id.textView5);
        textVTop = (TextView)findViewById(R.id.tvTop);
    }

    public void startIntent(View view) {
        if (view.getId() == R.id.button){
            String age = editTAge.getText().toString();  //.toString() make to String
            String ETname = editTName.getText().toString();
            String friend = editTBF.getText().toString();
            Log.d("StartIntent","Push Button1 : age"+age+"name"+ETname+"friend"+friend);
            Intent intent = new Intent(this,Main2Activity.class);
            intent.putExtra("name",ETname);
            intent.putExtra("number",age);   //Extra ข้อมูลเปงชุดโดยจะต้องกำนดชื่อที่ส่ง ในที่นี้คือส่ง "number" ที่เก้บค่า num ไปหน้าที่2 เรียกว่า bundle
            intent.putExtra("BFriend",friend);
            //intent.putExtra("Keyword"+value);
            // data จะส่งแค่หนึ่งค่า Extra ส่งหลายค่า
            startActivity(intent);

        }
    }
}
