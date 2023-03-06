package l.q.a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase */
public interface b extends Closeable {
    Cursor a(e eVar);

    Cursor a(e eVar, CancellationSignal cancellationSignal);

    void beginTransaction();

    Cursor c(String str);

    f compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    void setTransactionSuccessful();
}
