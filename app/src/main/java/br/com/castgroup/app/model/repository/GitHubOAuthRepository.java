package br.com.castgroup.app.model.repository;

import br.com.castgroup.app.model.entity.AccessToken;
import io.reactivex.Observable;

/**
 * Repository interface da API GitHub OAuth.
 * <p>
 * Created by falvojr on 1/13/17.
 */
public interface GitHubOAuthRepository {

    Observable<AccessToken> getAccessToken(String clientId, String clientSecret, String code);
}
