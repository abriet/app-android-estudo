package br.com.fiap.segundotina.app_android_estudo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declara os itens que vão se utilizados nesta tela
    EditText edtLogin;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //               cast     Localiza o ID do tipo do cast
        edtLogin    = (EditText) findViewById(R.id.edtUsuario);
        edtPass     = (EditText) findViewById(R.id.edtSenha);
    }

//    Cria a ação que vai ser chamada no XML (ao clicar no botão);
//                    View v - é imporante não tem como criar uma ação sem ele.
    public void logar(View v){

        String user = edtLogin.getText().toString().trim().toUpperCase();
        String pass = edtPass.getText().toString().trim();

        if (user.equals("")){

        }
    }

}
