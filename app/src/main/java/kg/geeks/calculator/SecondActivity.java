package kg.geeks.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    MaterialButton btn_red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String data = getIntent().getStringExtra("key20");
       btn_red= findViewById(R.id.btn_red);
       btn_red.setText(data);

    }

    public void onRedClick(View view) {
      finish();

    }
}