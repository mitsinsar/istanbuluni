package com.kangarootech.istanbuluni

import retrofit2.http.GET

interface UniService {

    @GET("f_getData?siteKey=5B765FE7627B4BCEA73B723C5523789E&EID=4E00590053005F006D004C00500035005500720059003100")
    suspend fun getFoodList(): FoodResponse
}
