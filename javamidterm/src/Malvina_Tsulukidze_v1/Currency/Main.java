package Malvina_Tsulukidze_v1.Currency;

import Malvina_Tsulukidze_v1.Currency.Service.Impl.CurrencyServiceImpl;
public class Main {
    public static void main(String[] args){
        CurrencyServiceImpl currencyService=new CurrencyServiceImpl();

        currencyService.setExchangeRate(3);
        System.out.println(currencyService.convert(122.3));
    }
}
