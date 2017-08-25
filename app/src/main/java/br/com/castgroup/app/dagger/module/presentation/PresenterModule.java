package br.com.castgroup.app.dagger.module.presentation;

import br.com.castgroup.app.dagger.scope.PerActivity;
import br.com.castgroup.app.model.repository.GitHubOAuthRepository;
import br.com.castgroup.app.model.repository.GitHubRepository;
import br.com.castgroup.app.model.repository.GitHubStatusRepository;
import br.com.castgroup.app.presentation.ui.auth.AuthContract;
import br.com.castgroup.app.presentation.ui.auth.AuthPresenter;
import br.com.castgroup.app.presentation.ui.repos.ReposContract;
import br.com.castgroup.app.presentation.ui.repos.ReposPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Module for presenters.
 *
 * Created by falvojr on 1/13/17.
 */
@Module
public class PresenterModule {

    //TODO (14) Dagger: Prove os Presenter's (MVP)
    //Importante: @PerActivity (escopo)

    @PerActivity
    @Provides
    AuthContract.Presenter providesAuthPresenter(
            GitHubRepository gitHubRepository,
            GitHubStatusRepository gitHubStatusRepository,
            GitHubOAuthRepository gitHubOAuthRepository) {
        return new AuthPresenter(gitHubRepository,
                gitHubStatusRepository,
                gitHubOAuthRepository);
    }

    @PerActivity
    @Provides
    ReposContract.Presenter providesResposPresenter(
            GitHubRepository gitHubRepository) {
        return new ReposPresenter(gitHubRepository);
    }
}
