package com.example.login_signup.Login_SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.login_signup.R;
import com.example.login_signup.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.viewLog.setVisibility(View.VISIBLE);
        binding.view.setVisibility(View.GONE);
        binding.logSelect.setVisibility(View.VISIBLE);
        binding.signSelect.setVisibility(View.GONE);
        binding.signUpBtn.setVisibility(View.GONE);

        binding.btnSign.setOnClickListener(v -> {
            binding.viewLog.setVisibility(View.GONE);
            binding.view.setVisibility(View.VISIBLE);
            binding.textViewLog.setVisibility(View.GONE);
            binding.textView.setVisibility(View.VISIBLE);
            binding.logSelect.setVisibility(View.GONE);
            binding.signSelect.setVisibility(View.VISIBLE);
            binding.signUpBtn.setVisibility(View.VISIBLE);
            binding.linearLayoutLog.setVisibility(View.GONE);
        });

        binding.btnLog.setOnClickListener(v -> {
            binding.view.setVisibility(View.GONE);
            binding.viewLog.setVisibility(View.VISIBLE);
            binding.textView.setVisibility(View.GONE);
            binding.textViewLog.setVisibility(View.VISIBLE);
            binding.logSelect.setVisibility(View.VISIBLE);
            binding.signSelect.setVisibility(View.GONE);
            binding.signUpBtn.setVisibility(View.GONE);
            binding.linearLayoutLog.setVisibility(View.VISIBLE);
        });

        binding.signInBtn.setOnClickListener(v -> {
            binding.view.setVisibility(View.GONE);
            binding.viewLog.setVisibility(View.VISIBLE);
            binding.textView.setVisibility(View.GONE);
            binding.textViewLog.setVisibility(View.VISIBLE);
            binding.logSelect.setVisibility(View.VISIBLE);
            binding.signSelect.setVisibility(View.GONE);
            binding.signUpBtn.setVisibility(View.GONE);
            binding.linearLayoutLog.setVisibility(View.VISIBLE);

        });
    }
}