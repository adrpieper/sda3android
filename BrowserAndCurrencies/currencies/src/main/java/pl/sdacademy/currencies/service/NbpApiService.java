package pl.sdacademy.currencies.service;

import java.util.List;

import pl.sdacademy.currencies.domain.CurrencyTable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by RENT on 2017-05-16.
 */

public interface NbpApiService {

    @GET("exchangerates/tables/{table}")
    Call<List<CurrencyTable>> getTables(@Path("table") String table, @Query("format") String format);

//    @GET("exchangerates/tables/{table}")
//    Call<List<CurrencyTable>> getTables(@Path("table") String table, @Query("format") String format);




//    @PUT
//    Call<Void> updateTable (Path("id") Long id, @Body CurrencyTable table, @Header("header") String value3);
}
