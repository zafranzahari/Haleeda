package com.e.haleedina_invt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisposalLayout extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disposal_layout);

        Button button_edit = findViewById(R.id.button_edit) ;
        button_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OnclickEdit(view);
            }
        });

    }

    public void OnclickEdit(View view) {

        Intent intent = new Intent(DisposalLayout.this , Edit_layout.class) ;
        startActivity(intent);
    }
}
