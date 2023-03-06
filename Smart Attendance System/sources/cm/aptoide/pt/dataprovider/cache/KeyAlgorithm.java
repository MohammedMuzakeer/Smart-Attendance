package cm.aptoide.pt.dataprovider.cache;

public interface KeyAlgorithm<Tin, Tout> {
    Tout getKeyFrom(Tin tin);
}
