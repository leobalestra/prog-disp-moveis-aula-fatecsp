package com.example.aluno.aulamobile5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class RecebeIntent extends AppCompatActivity{
    public static final String EXTRA_MSG1 = "msg1";
    public static final String EXTRA_MSG2 = "msg2";

    TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_intent);
        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(EXTRA_MSG1);
        String msg2 = intent.getStringExtra(EXTRA_MSG2);
        txtMensagem = findViewById(R.id.txtMensagem);
        txtMensagem.setText(msg1 + " " + msg2);
    }
}
