package android.ksigauke.com.rag.utils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class ActivityUtils {

    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, int frameId){

        if (fragmentManager.findFragmentById(fragment.getId()) == null){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(frameId, fragment);
            transaction.commit();
        }

    }

}
