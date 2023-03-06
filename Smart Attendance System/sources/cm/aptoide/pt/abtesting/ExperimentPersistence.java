package cm.aptoide.pt.abtesting;

import rx.Single;
import rx.b;

public interface ExperimentPersistence {
    Single<ExperimentModel> get(String str);

    b save(String str, Experiment experiment);
}
