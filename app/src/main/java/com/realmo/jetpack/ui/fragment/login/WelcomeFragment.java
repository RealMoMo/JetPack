package com.realmo.jetpack.ui.fragment.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.realmo.jetpack.R;
import com.realmo.jetpack.utils.Constant;
import com.realmo.jetpack.utils.SPUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

/**
 * @author Realmo
 * @version 1.0.0
 * @name JetPack
 * @email momo.weiye@gmail.com
 * @time 2020/3/10 10:03
 * @describe
 */
public class WelcomeFragment extends Fragment implements View.OnClickListener {

    private AppCompatButton btnLogin;
    private AppCompatButton btnRegister;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.welcome_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnLogin = view.findViewById(R.id.btn_login);
        btnRegister = view.findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:{

            }break;
            case R.id.btn_register:{

            }break;
            default:break;
        }
    }


    private void toLoginFragment(){
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setPopEnterAnim(R.anim.common_slide_in_left)
                .setPopExitAnim(R.anim.common_slide_out_right)
                .setEnterAnim(R.anim.common_slide_in_right)
                .setExitAnim(R.anim.common_slide_out_left);

        NavOptions navOptions = builder.build();

        String name = (String) SPUtils.get(this.getContext(), Constant.SP_FILE_NAME,Constant.SP_KEY_USER_NAME,Constant.DEFAULT_LOGIN_NAME);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.SP_KEY_USER_NAME,name);

        /**
         * 配置跳转
         * NavHostFragment.findNavController(Fragment)
         * Navigation.findNavController(Activity, @IdRes int viewId)
         * Navigation.findNavController(View)
         */


        NavHostFragment.findNavController(this).navigate(R.id.btn_login,bundle,navOptions);

    }

    private void toRegisterFragment(){

    }
}
