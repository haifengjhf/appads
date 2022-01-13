package com.jhf.test.reactnative;


//import com.facebook.react.PackageList;

import com.jhf.reactnative.Init;

import androidx.multidex.MultiDexApplication;

public class MyApp extends MultiDexApplication {
//    private MyReactNativeHost mReactNativeHost;
    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

//        SoLoader.init(this, false);
//        mReactNativeHost = new MyReactNativeHost(this);
//        mReactNativeHost.getReactInstanceManager();

        Init.init(this);
    }

//    public static class MyReactNativeHost extends ReactNativeHost{
//
//        protected MyReactNativeHost(Application application) {
//            super(application);
//        }
//
//        @Override
//        public boolean getUseDeveloperSupport() {
//            return BuildConfig.DEBUG;
//        }
//
//        @Override
//        protected List<ReactPackage> getPackages() {
//            @SuppressWarnings("UnnecessaryLocalVariable")
//            List<ReactPackage> packages = new PackageList(this).getPackages();
//            // Packages that cannot be autolinked yet can be added manually here, for example:
//            // packages.add(new MyReactNativePackage());
//            return packages;
//        }
//
//    }
//
//    @Override
//    public ReactNativeHost getReactNativeHost() {
//        return mReactNativeHost;
//    }

    public static MyApp getMyAp(){
        return mInstance;
    }
}
