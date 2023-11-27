package com.pakachu.apaydinfitness;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.pakachu.apaydinfitness.databinding.FragmentIletisimBinding;

public class IletisimFragment extends Fragment {

    FragmentIletisimBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentIletisimBinding.inflate(inflater, container, false);

        binding.imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.rotate));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/alisariasln")));
            }
        });

        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.rotate));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:905374639493")));
            }
        });

        binding.button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.76172310870116, 29.515405065199424")));
            }
        });

        binding.button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.76172310870116, 29.515405065199424")));

            }
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}