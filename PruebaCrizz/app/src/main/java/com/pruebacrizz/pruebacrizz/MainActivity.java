package com.pruebacrizz.pruebacrizz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.et_user)
    EditText mUserName;

    @BindView(R.id.et_pass)
    EditText mPassword;

    @BindView(R.id.btn_login)
    Button mBtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void heWeGo(View view) {

        credentialUser(mUserName.getText().toString(),mPassword.getText().toString());
    }
    public void credentialUser(String user, String password){
        if(user.isEmpty() == false && password.isEmpty() == false){
            showMain();
        }else{
            showMessageInvalideUser();
        }

    }
    public void showMessageInvalideUser(){
        Context context = getApplicationContext();
        CharSequence text = "empty fields";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void showMain() {
        Intent mainActivity = new Intent(this, CrizzPrueba.class);
        startActivity(mainActivity);
        finish();
    }
}
