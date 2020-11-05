package Malvina_Tsulukidze_v1.Currency.Service.Impl;

public class CurrencyServiceImpl {

        static double a, b;
        public void setExchangeRate(double argelodinagervadzei){
            b=argelodinagervadzei;
        }
        public static double convert(double gelodinagervadzei){
            a=gelodinagervadzei;
            return a/b;
        }
}