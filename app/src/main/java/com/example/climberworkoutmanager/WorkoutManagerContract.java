package com.example.climberworkoutmanager;

import android.provider.BaseColumns;

public final class WorkoutManagerContract {
	private WorkoutManagerContract() {
	}
	public static final String COLUMN_NAME_TIME = "Time";
	public static class Workout implements BaseColumns {
		public static final String TABLE_NAME = "Workout";
		public static final String _ID = "Workout_Id";
		public static final String COLUMN_NAME_CATEGORY_ID = "Category_Id";
		public static final String COLUMN_NAME_NAME = "Workout_Name";
		public static final String COLUMN_NAME_DESCRIPTION = "Description";

	}

	public static class Routine implements BaseColumns {
		public static final String TABLE_NAME = "Routine";
		public static final String _ID = "Routine_Id";
		public static final String COLUMN_NAME_WORKOUT_ID = "Workout_Id";
		public static final String COLUMN_NAME_NAME = "Routine_Name";
		public static final String COLUMN_NAME_DESCRIPTION = "Description";
		public static final String COLUMN_NAME_FAV = "Favourite";
	}

	public static class Category implements BaseColumns {
		public static final String TABLE_NAME = "Category";
		public static final String _ID = "Category_Id";
		public static final String COLUMN_NAME_NAME = "Category_Name";
	}
}
