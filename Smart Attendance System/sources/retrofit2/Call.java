package retrofit2;

import java.io.IOException;
import okhttp3.Request;
import s.b0;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    b0 timeout();
}
