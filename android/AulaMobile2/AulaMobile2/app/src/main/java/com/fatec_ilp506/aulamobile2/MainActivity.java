package com.fatec_ilp506.aulamobile2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random geraRand = new Random();
    private TextView txtMsg;
    private TextView txtNum;
    private Button btnRand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Faz referencia ao XML (O arquivo R.Java; concentra todas as definições visuais do android)
        //Ligação do codigo java com o xml

        //A classe R.Id liga a View
        txtMsg = findViewById(R.id.txtMsg);
        txtNum = findViewById(R.id.txtNum);
        btnRand = findViewById(R.id.btnRand);

        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudarConta();
            }
        });
    }

    //public void btnSend(View view){
    //    mudarConta();
    //}

    public void mudarConta(){

        int a;
        a = geraRand.nextInt(100);
        txtNum.setText(a + "/8 tem: ");
        if (a % 8 == 0)
            txtMsg.setText("Resto 0");
        else if (a % 8 == 1)
            txtMsg.setText("Resto 1");
        else if (a % 8 == 2)
            txtMsg.setText("Resto 2");
        else if (a % 8 == 3)
            txtMsg.setText("Resto 3");
        else if (a % 8 == 4)
            txtMsg.setText("Resto 4");
        else if (a % 8 == 5)
            txtMsg.setText("Resto 5");
        else if (a % 8 == 6)
            txtMsg.setText("Resto 6");
        else if (a % 8 == 7)
            txtMsg.setText("Resto 7");
        else
            txtMsg.setText("Nehum resto achado");
    }
}
