package com.realmo.jetpack.viewmodel;

import android.content.Context;
import android.content.Intent;

import com.realmo.jetpack.ui.activity.MainActivity;

import androidx.databinding.ObservableField;

/**
 * @author Realmo
 * @version 1.0.0
 * @name JetPack
 * @email momo.weiye@gmail.com
 * @time 2020/3/13 10:19
 * @describe
 */
public class RegisterModel {

    public ObservableField<String> email;
    public ObservableField<String> account;
    public ObservableField<String> password;
    private Context context;

    public RegisterModel(String email, String account, String password, Context context) {
       this.email = new ObservableField<>(email);
       this.account = new ObservableField<>(account);
       this.password = new ObservableField<>(password);
       this.context = context;
    }



    public void register(){
            registerSuccess();
    }


    private void registerSuccess(){
        //TODO 保存数据



        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}
