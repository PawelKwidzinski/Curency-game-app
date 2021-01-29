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

    void setRate(final Double rate) {
        this.rate = rate;
    }

    public CurrencyEnum getCurrencyEnum() {
        return currencyEnum;
    }

    public String getCurrencyString() {
        return currencyEnum.toString();
    }

    void setCurrencyEnum(final CurrencyEnum currencyEnum) {
        this.currencyEnum = currencyEnum;
    }
}
