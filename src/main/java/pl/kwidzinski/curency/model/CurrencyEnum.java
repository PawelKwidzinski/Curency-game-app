package pl.kwidzinski.curency.model;

public enum CurrencyEnum {
    AUD("Australian Dollar"),
    BGN("Bulgarian Lev"),
    BRL("Brazilian Real"),
    CAD("Canadian Dollar"),
    CHF("Swiss Franc"),
    CNY("Chinese Yuan Renminbi"),
    CZK("Czech Koruna"),
    DKK("Danish Krone"),
    EUR("Euro"),
    GBP("United Kingdom Pound Sterling"),
    HKD("Hongkong Dollar"),
    HRK("Croatian Kuna"),
    HUF("Hungarian Forint"),
    IDR("Indonesian Rupiah"),
    ILS("Israeli New Sheqel"),
    INR("Indian Rupee"),
    ISK("Icelandic Krona"),
    JPY("Japanese Yen"),
    KRW("Korean Won"),
    MXN("Mexican Peso"),
    MYR("Malaysian Ringgit"),
    NOK("Norwegian Krone"),
    NZD("New Zealand Dollar"),
    PHP("Philippine Peso"),
    RON("Romanian Leu"),
    RUB("Russian Ruble"),
    SEK("Swedish Krona"),
    SGD("Singapore Dollar"),
    THB("Thai Baht"),
    TRY("Turkish New Lira"),
    USD("United States Dollar"),
    ZAR("South African Rand");

    private final String name;

    CurrencyEnum(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
