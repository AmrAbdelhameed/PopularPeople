package com.example.ibtikarandroidtask.data

import com.example.ibtikarandroidtask.data.model.api.Result
import com.example.ibtikarandroidtask.utils.TestUtils
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PopularTest {
    private val mockPopularJson = "{ " +
            "\"id\": \"122503\", " +
            "\"name\": \"Liu Yifei\", " +
            "\"known_for_department\": \"Acting\", " +
            "\"profile_path\": \"/cL6JccAYqiZQEAIEFObEUC9LTt7.jpg\" " +
            "}"
    private lateinit var mockPopular: Result

    @Before
    fun setUp() {
        mockPopular = TestUtils.parsePopular(mockPopularJson)
    }

    @Test
    fun getName_Success() {
        val expectedName = "Liu Yifei"
        Assert.assertNotNull(mockPopular)
        Assert.assertNotNull(mockPopular.name)
        Assert.assertThat(expectedName, `is`(mockPopular.name))
    }

    @Test
    fun getKnowForDepartment_Success() {
        val expectedName = "Acting"
        Assert.assertNotNull(mockPopular)
        Assert.assertNotNull(mockPopular.knownForDepartment)
        Assert.assertThat(expectedName, `is`(mockPopular.knownForDepartment))
    }

    @Test
    fun getProfilePath_Parsed_Success() {
        val profilePath = "/cL6JccAYqiZQEAIEFObEUC9LTt7.jpg"
        Assert.assertNotNull(mockPopular)
        Assert.assertThat(profilePath, `is`(mockPopular.profilePath))
    }

    @Test
    fun getProfilePath_EmptyUrl() {
        val mockPopularJson = "{ " +
                "\"id\": \"122503\", " +
                "\"name\": \"Liu Yifei\", " +
                "\"known_for_department\": \"Acting\", " +
                "\"profile_path\": \"\" " +
                "}"
        val mockPopular = TestUtils.parsePopular(mockPopularJson)
        val expectedProfilePath = ""
        Assert.assertNotNull(mockPopular)
        Assert.assertThat(expectedProfilePath, `is`(mockPopular.profilePath))
    }
}