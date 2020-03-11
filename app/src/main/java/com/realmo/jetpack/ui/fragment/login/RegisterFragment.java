package com.realmo.jetpack.ui.fragment.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.realmo.jetpack.R;
import com.realmo.jetpack.utils.DefaultLogger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author Realmo
 * @version 1.0.0
 * @name JetPack
 * @email momo.weiye@gmail.com
 * @time 2020/3/10 10:04
 * @describe
 */
public class RegisterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.register_fragment,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initData();
    }

    private void initData() {
        String email = RegisterFragmentArgs.fromBundle(getArguments()).getEmail();
        DefaultLogger.debug("email:"+email);
    }
}
