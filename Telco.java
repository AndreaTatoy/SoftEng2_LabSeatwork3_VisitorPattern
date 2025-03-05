public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dateAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price){
        this.promoPrice = price;
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }

    public void setDateAllowance(int dateAllowance){
        this.dateAllowance = dateAllowance;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;
    }

    public String getTelcoName(){
        return telcoName;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public int getDateAllowance(){
        return dateAllowance;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }


    
}