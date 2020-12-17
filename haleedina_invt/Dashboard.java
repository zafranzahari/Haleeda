package com.e.haleedina_invt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    Button button_disposal = findViewById(R.id.button_disposal) ;
    button_disposal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            OnclickDisposal(view);
        }
    });

    }

    public void OnclickDisposal(View view) {

        Intent intent = new Intent(Dashboard.this , DisposalLayout.class) ;
        startActivity(intent);
    }
}

