package until;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 缓存数据库帮助类
 */
public class CarcareSQLiteHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "Carcare.db";
	public static final int DATABASE_VERSION = 3; // 1:1.2时只有news表；
													// 2:1.2时增加了violation_table;
													// 3:1.3第一版本
	public static CarcareSQLiteHelper mInstance = null;

	static Context mContext = null;

	// SQLiteDatabase mDb = null;

	/**
	 * 数据缓存表
	 */
	public static class Table {
		public interface CacheTable {
			public String TABLE_NAME = "cache_table";
		}
	}

	public CarcareSQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		mContext = context;
	}

	/**
	 * 单例模式
	 */
	public static synchronized CarcareSQLiteHelper getInstance(Context context) {
		if (mInstance == null) {
			mInstance = new CarcareSQLiteHelper(context);
		}
		return mInstance;
	}

	public void onCreate(SQLiteDatabase db) {
		StringBuffer sb = new StringBuffer("");

		// 数据缓存表
		sb.append("create table if not exists  ")
				.append(Table.CacheTable.TABLE_NAME)
				.append(" (cache_key varcher(20) PRIMARY KEY,cache_value text,level INTEGER);");

		db.execSQL(sb.toString());

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + Table.CacheTable.TABLE_NAME);
		onCreate(db);
	}

}
