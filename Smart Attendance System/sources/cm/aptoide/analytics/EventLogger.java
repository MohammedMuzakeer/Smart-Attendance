package cm.aptoide.analytics;

import cm.aptoide.analytics.AnalyticsManager.Action;
import java.util.Map;

public interface EventLogger {
    void log(String str, Map<String, Object> map, Action action, String str2);

    void setup();
}
