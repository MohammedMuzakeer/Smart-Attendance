package cm.aptoide.pt.view;

public interface BackButton {

    public interface ClickHandler {
        boolean handle();
    }

    void registerClickHandler(ClickHandler clickHandler);

    void unregisterClickHandler(ClickHandler clickHandler);
}
