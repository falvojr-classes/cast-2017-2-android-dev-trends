package br.com.castgroup.app.presentation.base;

import android.support.v7.app.AppCompatActivity;

import br.com.castgroup.app.MyApplication;
import br.com.castgroup.app.dagger.subcomponent.ActivitySubcomponent;

/**
 * Base {@link AppCompatActivity}.
 *
 * Created by falvojr on 1/12/17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }

    protected ActivitySubcomponent getDaggerActivitySubcomponent() {
        return this.getMyApplication().getDaggerActivitySubcomponent();
    }

}
