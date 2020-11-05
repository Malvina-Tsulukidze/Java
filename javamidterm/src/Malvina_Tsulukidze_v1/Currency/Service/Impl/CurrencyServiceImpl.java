package Malvina_Tsulukidze_v1.Currency.Service.Impl;

public class CurrencyServiceImpl {

        static double a, b;
        public void setExchangeRate(double malu1){
            b=malu1;
        }
        public static double convert(double malu){
            a=malu;
            return a/b;
        }
}