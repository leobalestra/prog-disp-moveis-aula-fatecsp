package com.fatec_ilp506.aulamobile6;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int segundos = 0;
    private boolean contando = false;
    private boolean contagemAtiva = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            segundos = savedInstanceState.getInt("segundos");
            contando = savedInstanceState.getBoolean("contando");
        }
        runCronometro();
//        Button btnIniciar = findViewById(R.id.btnIniciar);
//        btnIniciar.setTransformationMethod(null);
    }

    @Override
    public void onSaveInstanceState(Bundle salvarEstadoApp){
        super.onSaveInstanceState(salvarEstadoApp);
        salvarEstadoApp.putInt("segundos", segundos);
        salvarEstadoApp.putBoolean("contando", contando);
    }

    public void onStop(){
        super.onStop();
        contagemAtiva = contando;
        contando = false;
    }

    @Override
    public void onStart(){
        super.onStart();
        if (contagemAtiva)
            contando = true;
    }

    public void btnIniciarOnClick(View view) {
        contando = true;
//        cronometra();
    }

    public void btnPararOnClick(View view) {
        contando = false;
    }

    public void btnZerarOnClick(View view) {
        contando = false;
        segundos = 0;
    }

    private void cronometra() {
        int hor = segundos / 3600;
        int min = (segundos % 3600) / 60;
        int seg = segundos % 60;
        String strExibir = String.format("%d:%02d:%02d", hor, min, seg);
        TextView txtCronos = findViewById(R.id.txtCronos);
        txtCronos.setText(strExibir);
        if (contando)
            segundos++;
    }

    private void runCronometro() {
        final TextView txtCronos = findViewById(R.id.txtCronos);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hor = segundos / 3600;
                int min = (segundos % 3600) / 60;
                int seg = segundos % 60;
                String strExibir = String.format("%d:%02d:%02d", hor, min, seg);
                txtCronos.setText(strExibir);
                handler.postDelayed(this, 1000);
                if (contando)
                    segundos++;
            }
        });
    }
}
