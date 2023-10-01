package com.pakachu.apaydinfitness.helpers;

import android.app.Activity;
import android.view.View;

import androidx.annotation.NonNull;

import com.pakachu.apaydinfitness.Credentials;
import com.pakachu.apaydinfitness.MainActivity;
import com.pakachu.apaydinfitness.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.pakachu.apaydinfitness.db.DBLogin;

public class AddLoader {

    private InterstitialAd mInterstitialAd;

    private Activity activity;

    public AddLoader(Activity activity) {
        this.activity = activity;
    }

    public void RequestInterstatial() {
        {
            DBLogin dbLogin = new DBLogin(activity.getApplication());
            if (MainActivity.addReadyToLoad && dbLogin.getClearenceLevel() < 100) {
                MainActivity.addReadyToLoad = false;
                AdRequest adRequest = new AdRequest.Builder().build();
                InterstitialAd.load(activity, Credentials.getAdd_id(), adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;

                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        mInterstitialAd = null;
                                        MainActivity.addCountDownTimer.start();
                                    }
                                });
                                if (mInterstitialAd != null) {
                                    mInterstitialAd.show(activity);
                                }

                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                mInterstitialAd = null;

                                MainActivity.addReadyToLoad = false;
                                MainActivity.addCountDownTimer.start();
                            }
                        });
            }
        }
    }
}
