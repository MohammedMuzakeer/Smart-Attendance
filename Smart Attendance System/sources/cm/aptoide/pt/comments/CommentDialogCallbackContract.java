package cm.aptoide.pt.comments;

import cm.aptoide.pt.dataprovider.model.v7.BaseV7Response;

public interface CommentDialogCallbackContract {
    void okSelected(BaseV7Response baseV7Response, long j, Long l, String str);
}
