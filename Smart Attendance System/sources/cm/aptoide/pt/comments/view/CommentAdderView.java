package cm.aptoide.pt.comments.view;

import cm.aptoide.pt.dataprovider.model.v7.Comment;
import cm.aptoide.pt.view.recycler.displayable.Displayable;
import java.util.List;

public interface CommentAdderView<Tadapter extends CommentsAdapter> {
    void createDisplayableComments(List<Comment> list, List<Displayable> list2);

    Tadapter getAdapter();
}
