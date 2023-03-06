package cm.aptoide.pt.abtesting;

import cm.aptoide.pt.abtesting.BaseExperiment.ExperimentType;
import rx.b;
import rx.e;

public interface AbTestRepository {
    b cacheExperiment(ExperimentModel experimentModel, String str);

    e<Experiment> getExperiment(String str, ExperimentType experimentType);

    e<String> getExperimentId(String str);

    e<Boolean> recordAction(String str, int i, ExperimentType experimentType);

    e<Boolean> recordAction(String str, ExperimentType experimentType);

    e<Boolean> recordImpression(String str, ExperimentType experimentType);
}
