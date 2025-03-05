import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{
    private static Map<String, Boolean> packageMap = new HashMap<>();

    static{
        packageMap.put("Smart", false);
        packageMap.put("Globe", true);
        packageMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        Boolean offerValue = packageMap.getOrDefault(telcoName, true);
        return offerValue.toString();
    }
    
}