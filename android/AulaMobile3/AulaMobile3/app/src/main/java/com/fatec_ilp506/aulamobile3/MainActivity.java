package com.fatec_ilp506.aulamobile3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random geraRand = new Random();
    private TextView txtNumero;
    private TextView edtNumero;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = findViewById(R.id.txtNumero);
        edtNumero = findViewById(R.id.edtNumero);
        txtResult = findViewById(R.id.txtResult);
    }

    public void gerarNumero(View view){
        int a = geraRand.nextInt(1000);
        String s;
        s = String.format("%d", a);
        txtNumero.setText(s);
    }

    public void transfereNumero(View view){
        String t;
        t = txtNumero.getText().toString();
        edtNumero.setText(t);
    }

    public void parImpar(View view){
        int n;
        n = Integer.parseInt(edtNumero.getText().toString());

        if(n % 2 == 0)
            txtResult.setText(n + " é par");
        else
            txtResult.setText(n + " é ímpar");
    }

    public void numeroPrimo(View view){
        int n;
        n = Integer.parseInt(edtNumero.getText().toString());

        boolean isPrimo = true;
        int divisor = 0;
        for (int i = 2; i <= n; i++) {
            if ( ( (n % i) == 0) && (i != n) ) {
                isPrimo = false;
                divisor = i;
                break;
            }
        }

        if (isPrimo) {
            txtResult.setText(n + " é primo");
        } else {
            txtResult.setText(n + " não é primo");;
        }
    }
}
