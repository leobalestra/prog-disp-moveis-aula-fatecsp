package com.fatec_ilp506.aulamobile4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CursosFatec buscaFatecs = new CursosFatec();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnCursos(View view){
        TextView txtFatecs = findViewById(R.id.txtFatecs2);
        Spinner spnCursos = findViewById(R.id.spnCursos);
        String cursoEscolhido = String.valueOf(spnCursos.getSelectedItem());
        List<String> listaFatecs = buscaFatecs.getFatecs(cursoEscolhido);
        StringBuilder s = new StringBuilder();

        for(String x : listaFatecs){
            s.append(x);
            s.append("\n");
        }

        txtFatecs.setText(s);
    }
}
