package com.mvp.eduarda.mvpsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainMVP.View {

    private TextView numero;
    private Button botaoSoma;
    private Button botaoSalvar;
    private Button botaoZerar;
    private PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (TextView) findViewById(R.id.numero);
        botaoSoma = (Button) findViewById(R.id.botaoSoma);
        botaoSalvar = (Button) findViewById(R.id.botaoSalvar);
        botaoZerar = (Button) findViewById(R.id.botaoZerar);

        presenter = new PresenterImpl(this,MVPSimples.getInstance().getPreferences());

        presenter.buscaValor();

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickBotaoSomar();
            }
        });

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickBotaoSalvar(numero.getText().toString());

            }
        });

        botaoZerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickBotaoZerar();

            }
        });

    }


    @Override
    public void updateValor(String num) {
        numero.setText(num);
    }


}
