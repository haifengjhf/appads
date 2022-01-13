package com.jhf.reactnative;

import com.facebook.react.PackageList;
import com.facebook.react.ReactPackage;

import android.app.Application;

import java.util.List;

public class Init {
    private static List<ReactPackage> mPackages;

    public static void init(Application app){
        List<ReactPackage> packages = new PackageList(app).getPackages();
        mPackages = packages;
        mPackages.add(new CustomPackage());
    }

    public static List<ReactPackage> getPackageList(){
        return mPackages;
    }
}
