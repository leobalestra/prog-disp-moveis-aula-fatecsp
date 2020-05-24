package com.example.aluno.aulamobile5;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnIniciaIntent(View view) {
        EditText edtMensagem = findViewById(R.id.edtMensagem);
        Intent intent = new Intent(this, RecebeIntent.class);
        intent.putExtra(RecebeIntent.EXTRA_MSG1, "Digitado: ");
        intent.putExtra(RecebeIntent.EXTRA_MSG2, edtMensagem.getText().toString());
        startActivity(intent);
    }

    public void onClickBtnEnviaGeral(View view) {
        EditText edtMensagem = findViewById(R.id.edtMensagem);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, edtMensagem.getText().toString());
        startActivity(intent);
    }

    public void onClickBtnSempreEscolhe(View view) {
        EditText edtMensagem = findViewById(R.id.edtMensagem);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, edtMensagem.getText().toString());
        String tituloEscolha = "Escolha o app...";
        Intent intentEscolhido = Intent.createChooser(intent, tituloEscolha);
        startActivity(intentEscolhido);
    }

    public void onClickBtnEnviaWhatsApp(View view) {
        PackageManager pm = getPackageManager();
        try {
            EditText edtMensagem = findViewById(R.id.edtMensagem);
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            // Verifica se o pacote existe (app instalado). Se não estiver desvia para o bloco catch
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, edtMensagem.getText().toString());
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp não Instalado", Toast.LENGTH_SHORT).show();
        }
    }
}