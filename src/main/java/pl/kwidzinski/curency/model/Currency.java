package pl.kwidzinski.curency.model;

public class Currency {

    private Double rate;
    private CurrencyEnum currencyEnum;

    public Currency(final Double rate, final CurrencyEnum currencyEnum) {
        this.rate = rate;
        this.currencyEnum = currencyEnum;
    }

    public Double getRate() {
        return rate;
    }

    public CurrencyEnum getCurrencyEnum() {
        return currencyEnum;
    }

    public String getCurrencyString() {
        return currencyEnum.toString();
    }

}
