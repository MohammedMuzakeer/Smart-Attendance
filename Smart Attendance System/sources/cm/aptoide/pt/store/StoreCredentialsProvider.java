package cm.aptoide.pt.store;

import cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore.StoreCredentials;

public interface StoreCredentialsProvider {
    StoreCredentials fromUrl(String str);

    StoreCredentials get(long j);

    StoreCredentials get(String str);
}
