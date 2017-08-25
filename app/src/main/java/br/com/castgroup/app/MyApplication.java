package br.com.castgroup.app;

import android.app.Application;

import br.com.castgroup.app.dagger.DaggerMainComponent;
import br.com.castgroup.app.dagger.MainComponent;
import br.com.castgroup.app.dagger.subcomponent.ActivitySubcomponent;
import br.com.castgroup.app.dagger.module.ApplicationModule;

/**
 * My custom {@link Application}.
 *
 * Created by falvojr on 1/12/17.
 */
public class MyApplication extends Application {

    //TODO (17) Dagger: Cria e disponibiliza o componente do Dagger para o App.

    private MainComponent mMainComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mMainComponent = DaggerMainComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ActivitySubcomponent getDaggerActivitySubcomponent() {
        return mMainComponent.activitySubcomponent();
    }
}
