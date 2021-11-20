public class InterfaceExample3 {
    public static void main(String[] args){
        Fuel refarr[] = {
                new Brio();
                new JeepCompass();
                new TataNexonEV();
        };
        for (Fuel X : refarr)
        X.fuel_info();

    }
}

interface Fuel {
    void fuel_info();
}
class Brio implements Fuel{
    public void fuel_info()
    {
        System.out.println("Brio runs on Petrol");
    }
}
class JeepCompass implements Fuel{
    public void fuel_info()
    {
        System.out.println("JeepCompass runs on Diesel");
    }
}

class TataNexonEV implements Fuel{
    public void fuel_info()
    {
        System.out.println("TataNexonEV runs on Electricity");
    }
}
