package cm.aptoide.pt.install.remote;

public interface RemoteInstallationSenderListener {
    void onAppSendSuccess();

    void onAppSendUnsuccess();

    void onAptoideTVServiceFound(ReceiverDevice receiverDevice);

    void onAptoideTVServiceLost(ReceiverDevice receiverDevice);

    void onDiscoveryStarted();

    void onDiscoveryStopped();

    void onNoNetworkAccess();
}
