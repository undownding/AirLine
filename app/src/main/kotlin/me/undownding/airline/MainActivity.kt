package me.undownding.airline

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import me.undownding.airline.cs.api.CSApi
import retrofit.RestAdapter
import rx.android.schedulers.AndroidSchedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val csApi = RestAdapter.Builder().setEndpoint(CSApi.CSSERVER_URL).setLogLevel(RestAdapter.LogLevel.FULL).build().create(CSApi::class.java)
        csApi.query(CSApi.QueryArgsBody("SHA", "CAN", "20160327").toJson())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    Log.d("test", result.toString());
                },
                        { error ->
                            error.printStackTrace()
                        })
    }
}
