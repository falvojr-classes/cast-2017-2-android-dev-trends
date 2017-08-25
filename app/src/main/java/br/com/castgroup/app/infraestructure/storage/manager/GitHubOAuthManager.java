package br.com.castgroup.app.infraestructure.storage.manager;

import javax.inject.Inject;

import br.com.castgroup.app.model.entity.AccessToken;
import br.com.castgroup.app.model.repository.GitHubOAuthRepository;
import br.com.castgroup.app.infraestructure.storage.service.GitHubOAuthService;
import io.reactivex.Observable;

/**
 * Manager for {@link GitHubOAuthRepository}.
 *
 * Created by falvojr on 1/13/17.
 */
public class GitHubOAuthManager implements GitHubOAuthRepository {

    private final GitHubOAuthService mGitHubOAuthService;

    @Inject
    public GitHubOAuthManager(GitHubOAuthService gitHubOAuthService) {
        mGitHubOAuthService = gitHubOAuthService;
    }

    @Override
    public Observable<AccessToken> getAccessToken(String clientId, String clientSecret, String code) {
        return mGitHubOAuthService.getAccessToken(clientId, clientSecret, code);
    }
}
