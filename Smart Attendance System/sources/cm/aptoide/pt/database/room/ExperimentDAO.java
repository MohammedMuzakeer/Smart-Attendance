package cm.aptoide.pt.database.room;

import q.a.w;

public interface ExperimentDAO {
    w<RoomExperiment> get(String str);

    void save(RoomExperiment roomExperiment);
}
