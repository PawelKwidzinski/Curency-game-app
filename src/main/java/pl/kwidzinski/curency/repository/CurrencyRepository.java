package pl.kwidzinski.curency.repository;

import org.springframework.stereotype.Repository;
import pl.kwidzinski.curency.model.Currency;
import pl.kwidzinski.curency.model.CurrencyData;
import pl.kwidzinski.curency.model.CurrencyEnum;


import java.util.ArrayList;
import java.util.List;

@Repository
public class CurrencyRepository {

    private List<Currency> currencyList;

    public void initCurrencyData(CurrencyData currencyData) {
        currencyList = new ArrayList<>();
        setCurrencyData(currencyData);
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }


    private void setCurrencyData(CurrencyData currencyData) {
        currencyList.add(new Currency(currencyData.getRates().getCAD(), CurrencyEnum.CAD));
        currencyList.add(new Currency(currencyData.getRates().getHKD(), CurrencyEnum.HKD));
        currencyList.add(new Currency(currencyData.getRates().getISK(), CurrencyEnum.ISK));
        currencyList.add(new Currency(currencyData.getRates().getPHP(), CurrencyEnum.PHP));
        currencyList.add(new Currency(currencyData.getRates().getDKK(), CurrencyEnum.DKK));
        currencyList.add(new Currency(currencyData.getRates().getHUF(), CurrencyEnum.HUF));
        currencyList.add(new Currency(currencyData.getRates().getCZK(), CurrencyEnum.CZK));
        currencyList.add(new Currency(currencyData.getRates().getGBP(), CurrencyEnum.GBP));
        currencyList.add(new Currency(currencyData.getRates().getRON(), CurrencyEnum.RON));
        currencyList.add(new Currency(currencyData.getRates().getSEK(), CurrencyEnum.SEK));
        currencyList.add(new Currency(currencyData.getRates().getIDR(), CurrencyEnum.IDR));
        currencyList.add(new Currency(currencyData.getRates().getINR(), CurrencyEnum.INR));
        currencyList.add(new Currency(currencyData.getRates().getBRL(), CurrencyEnum.BRL));
        currencyList.add(new Currency(currencyData.getRates().getRUB(), CurrencyEnum.RUB));
        currencyList.add(new Currency(currencyData.getRates().getHRK(), CurrencyEnum.HRK));
        currencyList.add(new Currency(currencyData.getRates().getJPY(), CurrencyEnum.JPY));
        currencyList.add(new Currency(currencyData.getRates().getTHB(), CurrencyEnum.THB));
        currencyList.add(new Currency(currencyData.getRates().getCHF(), CurrencyEnum.CHF));
        currencyList.add(new Currency(currencyData.getRates().getEUR(), CurrencyEnum.EUR));
        currencyList.add(new Currency(currencyData.getRates().getBGN(), CurrencyEnum.BGN));
        currencyList.add(new Currency(currencyData.getRates().getTRY(), CurrencyEnum.TRY));
        currencyList.add(new Currency(currencyData.getRates().getCNY(), CurrencyEnum.CNY));
        currencyList.add(new Currency(currencyData.getRates().getNOK(), CurrencyEnum.NOK));
        currencyList.add(new Currency(currencyData.getRates().getNZD(), CurrencyEnum.NZD));
        currencyList.add(new Currency(currencyData.getRates().getZAR(), CurrencyEnum.ZAR));
        currencyList.add(new Currency(currencyData.getRates().getUSD(), CurrencyEnum.USD));
        currencyList.add(new Currency(currencyData.getRates().getMXN(), CurrencyEnum.MXN));
        currencyList.add(new Currency(currencyData.getRates().getSGD(), CurrencyEnum.SGD));
        currencyList.add(new Currency(currencyData.getRates().getAUD(), CurrencyEnum.AUD));
        currencyList.add(new Currency(currencyData.getRates().getILS(), CurrencyEnum.ILS));
        currencyList.add(new Currency(currencyData.getRates().getKRW(), CurrencyEnum.KRW));
        currencyList.add(new Currency(currencyData.getRates().getMYR(), CurrencyEnum.MYR));
    }
}
