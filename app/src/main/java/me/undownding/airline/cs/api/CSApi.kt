package me.undownding.airline.cs.api

import com.google.gson.Gson
import me.undownding.airline.cs.model.CSAirApiResult
import retrofit.http.Body
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
    fun query(@Field("json") jsonArgs: String): Observable<CSAirApiResult>

    public class QueryArgsBody(depcity: String, arrcity: String, flightdate: String) {
        var depcity = "SHA"
        var arrcity = "CAN"
        var flightdate = "20160327"
        var adultnum = 1
        var childnum = 0
        var infantnum = 0
        var cabinorder = 0
        var airline = 1
        var flytype = 1
        var international = 0
        var action = 0
        var segtype = 1
        var cache = 0
        var preUrl = "null"
        var isMember = ""

        fun toJson() : String {
            return "${Gson().toJson(this)}"
        }
    }
}
