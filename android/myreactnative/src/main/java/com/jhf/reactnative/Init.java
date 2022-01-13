package com.jhf.reactnative;

import com.facebook.react.ReactPackage;

import java.util.List;

public class Init {
    private static List<ReactPackage> mPackages;

    public static void init(List<ReactPackage> packages){
        mPackages = packages;
        mPackages.add(new CustomPackage());
    }

    public static List<ReactPackage> getPackageList(){
        return mPackages;
    }
}
