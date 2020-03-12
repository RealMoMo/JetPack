package com.realmo.jetpack.ui.fragment.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.realmo.jetpack.databinding.LoginFragmentBinding;
import com.realmo.jetpack.viewmodel.LoginModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author Realmo
 * @version 1.0.0
 * @name JetPack
 * @email momo.weiye@gmail.com
 * @time 2020/3/10 10:03
 * @describe
 */
public class LoginFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LoginFragmentBinding binding = LoginFragmentBinding.inflate(inflater, container, false);
        binding.setModel(new LoginModel("newline","123456",getContext()));
        return  binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        String userName = getArguments().getString(Constant.SP_KEY_USER_NAME, Constant.DEFAULT_LOGIN_NAME);
//        DefaultLogger.debug("username:"+userName);
    }
}
