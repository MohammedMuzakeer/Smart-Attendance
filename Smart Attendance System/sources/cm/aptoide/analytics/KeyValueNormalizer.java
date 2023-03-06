package cm.aptoide.analytics;

import java.util.Map;

public interface KeyValueNormalizer {
    Map<String, Object> normalize(Map<String, Object> map);
}
