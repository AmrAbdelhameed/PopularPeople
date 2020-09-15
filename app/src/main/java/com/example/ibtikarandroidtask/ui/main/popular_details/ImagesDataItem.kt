package com.example.ibtikarandroidtask.ui.main.popular_details

import com.example.ibtikarandroidtask.utils.AppConstants
import java.io.Serializable

class ImagesDataItem(
    filePath: String?
) : Serializable {
    val imageUrl = AppConstants.MEDIA_BASE_URL + filePath
}