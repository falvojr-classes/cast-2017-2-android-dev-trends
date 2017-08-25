package br.com.castgroup.app.dagger;

import javax.inject.Singleton;

import br.com.castgroup.app.dagger.module.ApplicationModule;
import br.com.castgroup.app.dagger.module.presentation.PreferenceModule;
import br.com.castgroup.app.dagger.module.infraestructure.ManagerModule;
import br.com.castgroup.app.dagger.module.infraestructure.NetworkModule;
import br.com.castgroup.app.dagger.module.infraestructure.ServiceModule;
import br.com.castgroup.app.dagger.module.presentation.HelperModule;
import br.com.castgroup.app.dagger.subcomponent.ActivitySubcomponent;
import dagger.Component;

/**
 * Main Dagger {@link Component}.
 *
 * Created by falvojr on 1/12/17.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        HelperModule.class,
        PreferenceModule.class,
        NetworkModule.class,
        ServiceModule.class,
        ManagerModule.class
})
public interface MainComponent {

    //TODO (16) Dagger: Componente principal do Dagger (ver MyApplication)
    //Importante: @Component

    ActivitySubcomponent activitySubcomponent();
}
