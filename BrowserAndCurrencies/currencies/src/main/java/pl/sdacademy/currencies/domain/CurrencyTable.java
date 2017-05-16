package pl.sdacademy.currencies.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;


@Data
public class CurrencyTable {

    private String table;


    @SerializedName("no")
    private String number;

    private String effectiveDate;

    @SerializedName("rates")
    private List<CurrencyRate> currencies;


}
