package com.mvp.eduarda.mvpsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainMVP.View {

    private TextView numero;
    private Button botaoSoma;
    private PresenterImpl presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (TextView) findViewById(R.id.numero);
        botaoSoma = (Button) findViewById(R.id.botaoSoma);
        presenter = new PresenterImpl(this);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickBotao();
            }
        });

    }


    @Override
    public void updateValor(int num) {

        numero.setText(num);

    }
}
