package com.kangarootech.istanbuluni

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private var uniService: UniService? = null

        fun getUniService(): UniService {
            if (uniService == null) {
                uniService = Retrofit.Builder()
                    .baseUrl("https://service-cms.istanbul.edu.tr/api/webclient/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .build()
                    .create(UniService::class.java)
            }
            return uniService!!
        }
    }
}
