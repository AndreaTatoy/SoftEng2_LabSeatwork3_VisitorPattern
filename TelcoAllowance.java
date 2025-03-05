import java.util.*;

public class TelcoAllowance implements UsagePromo{
    private static Map<String, Double> promoMap = new HashMap<>();

    static{
        promoMap.put("Smart", (double) 500);
        promoMap.put("Globe", (double)450);
        promoMap.put("Ditto", (double)400);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        Double allowance = promoMap.get(telcoName) * money;
        return String.valueOf(allowance);
    }
}