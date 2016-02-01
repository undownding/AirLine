package me.undownding.airline.cs.api

import me.undownding.airline.cs.model.CSAirApiResult
import retrofit.http.Field
import retrofit.http.FormUrlEncoded
import retrofit.http.POST
import rx.Observable

/**
 * Created by undownding on 2016/2/1.
 */
interface CSApi {

    companion object {
        public val CSSERVER_URL = "http://b2c.csair.com"
    }

    /**
     * 通过南航接口获取机票信息
     *
     * 建议通过 Kotlin 调用，只需指定前三个参数，其他的不用动
     *
     */
    @POST("/B2C40/query/jaxb/direct/query.ao")
    @FormUrlEncoded
    fun query(@Field("depcity") depcity: String = "SHA",
              @Field("arrcity") arrcity: String = "CAN",
              @Field("flightdate") flightdate: String = "20160327",
              @Field("adultnum") adultnum: Int = 1,
              @Field("childnum") childnum: Int = 0,
              @Field("infantnum") infantnum: Int = 0,
              @Field("cabinorder") cabinorder: Int = 0,
              @Field("airline") airline: Int = 1,
              @Field("flytype") flytype: Int = 1,
              @Field("international") international: Int = 0,
              @Field("action") action: Int = 0,
              @Field("segtype") segtype: Int = 1,
              @Field("cache") cache: Int = 0,
              @Field("preUrl") preUrl: String = "null",
              @Field("isMember") isMember: String = ""
              ): Observable<CSAirApiResult>
}
