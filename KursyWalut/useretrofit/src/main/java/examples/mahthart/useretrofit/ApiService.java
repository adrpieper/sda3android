package examples.mahthart.useretrofit;

import java.util.List;

import retrofit2.http.GET;


/**
 * Created by Medard on 2017-05-07.
 */

public interface ApiService {

    @GET("/api/exchangerates/tables")
    List<Waluta> getWaluta();

}