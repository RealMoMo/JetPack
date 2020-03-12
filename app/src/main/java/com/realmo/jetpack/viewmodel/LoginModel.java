package com.realmo.jetpack.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.realmo.jetpack.ui.activity.MainActivity;
import com.realmo.jetpack.utils.Constant;

import androidx.databinding.ObservableField;

/**
 * @author Realmo
 * @version 1.0.0
 * @name JetPack
 * @email momo.weiye@gmail.com
 * @time 2020/3/11 20:06
 * @describe
 */
public class LoginModel {


    private Context context;

    public ObservableField<String> name;
    public ObservableField<String> pwd;


    public LoginModel(String name, String pwd, Context context) {

        this.context = context;

        this.name = new ObservableField<>(name);
        this.pwd = new ObservableField<>(pwd);
    }



    public void login(){
        //假数据
        if(Constant.DEFAULT_LOGIN_NAME.equals(name.get())){

            if(Constant.DEFAULT_LOGIN_PASSWORD.equals(pwd.get())){
                loginSuccess();
            }else{
                Toast.makeText(context, "Password not correct", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(context, "Can not find this user", Toast.LENGTH_SHORT).show();
        }

    }


    private void loginSuccess(){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }




}
