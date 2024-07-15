package com.example.famousdialogues;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private static final String FILE_EMAIL = "rememberMe";
    private EditText emailTextView, passwordTextView;
    private Button Btn;
    private ProgressBar progressbar;
    CheckBox checkBox;

    private FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailTextView = findViewById(R.id.email);
        passwordTextView = findViewById(R.id.password);
        Btn = findViewById(R.id.login);
        progressbar = findViewById(R.id.progressBar);
        mAuth = FirebaseAuth.getInstance();
        checkBox = findViewById(R.id.checkBox);

        SharedPreferences sharedPreferences = getSharedPreferences("checkBox",MODE_PRIVATE);
        String checkbox = sharedPreferences.getString("remember","");
        if (checkbox.equals("true")){
            startActivity(new Intent(LoginActivity.this, Movies.class));
            finish();
//            Toast.makeText(this, "reach", Toast.LENGTH_SHORT).show();
        }
        else if(checkbox.equals("false")){
            Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
        }

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUserAccount();
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()){
                    SharedPreferences preferences = getSharedPreferences("checkBox",MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember","true");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                }
                else if (!compoundButton.isChecked()){
                    SharedPreferences preferences = getSharedPreferences("checkBox",MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("remember","false");
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "UnChecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void loginUserAccount() {

        // show the visibility of progress bar to show loading
        progressbar.setVisibility(View.VISIBLE);

        // Take the value of two edit texts in Strings
        String email, password;
        email = emailTextView.getText().toString();
        password = passwordTextView.getText().toString();


        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(),
                            "Please enter email!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(),
                            "Please enter password!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }

        // signin existing user
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Login successful!!", Toast.LENGTH_LONG).show();

                    progressbar.setVisibility(View.GONE);
                    Intent intent = new Intent(LoginActivity.this, Movies.class);
                    startActivity(intent);
                    finish();
                } else {
                    // sign-in failed
                    Toast.makeText(getApplicationContext(), "Login failed!!", Toast.LENGTH_LONG).show();
                    progressbar.setVisibility(View.GONE);
                }
            }
        });
    }

    public void account(View view){
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
//        finish();
    }

}