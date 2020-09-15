package com.example.ibtikarandroidtask.data.local.prefs

import android.content.SharedPreferences
import javax.inject.Inject

class PreferencesRepository @Inject constructor(private val sharedPreferences: SharedPreferences) : PreferencesDataSource