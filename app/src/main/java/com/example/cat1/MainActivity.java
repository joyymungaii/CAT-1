package com.example.cat1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ed_1;
    EditText ed_2;
    Button btn_compute;
    TextView total_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ed_1 = (EditText) findViewById(R.id.ed_1);
        ed_2 = (EditText) findViewById(R.id.ed_2);
        btn_compute = (Button) findViewById(R.id.btn_compute);
        total_ans = (TextView) findViewById(R.id.total_ans);
        btn_compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hoursWorked = Double.parseDouble(ed_1.getText().toString());
                double ratePerHour = Double.parseDouble(ed_2.getText().toString());
                double compute = hoursWorked * ratePerHour;

                total_ans.setText(Double.toString(compute));

            }
        });
    }

}