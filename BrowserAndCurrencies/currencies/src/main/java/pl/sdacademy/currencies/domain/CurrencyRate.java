package pl.sdacademy.currencies.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyRate {

    private String currency;

    private String code;

    private Double mid;

}
