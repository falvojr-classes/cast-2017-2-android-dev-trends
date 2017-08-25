package br.com.castgroup.app.model.repository;

import br.com.castgroup.app.model.entity.Status;
import io.reactivex.Observable;

/**
 * Repository interface da API GitHub Status.
 * <p>
 * Created by falvojr on 1/13/17.
 */
public interface GitHubStatusRepository {

    Observable<Status> getLastStatus();
}
