import java.math.BigDecimal;

/**
 * Created by naveengaur on 21/4/18.
 */

public class XbrlElements {


    BigDecimal Assets;
    BigDecimal Liabilities;
    BigDecimal InventoryNet;
    BigDecimal AssetsCurrent;
    BigDecimal LiabilitiesCurrent;
    BigDecimal LiabilitiesAndStockHolderEquity;
    BigDecimal CashAndCashEquivalentAtCarryingValue;
// constructor
    public XbrlElements()
    {
// intialise ratio list here
    }

    public BigDecimal getAssets() {
        return Assets;
    }

    public void setAssets(BigDecimal assets) {

        Assets = assets;
    }
    public BigDecimal getLiabilities() {
        return Liabilities;
    }

    public void setLiabilities(BigDecimal liabilities) {
        Liabilities = liabilities;
    }

    public BigDecimal getInventoryNet() {
        return InventoryNet;
    }

    public void setInventoryNet(BigDecimal inventoryNet) {
        InventoryNet = inventoryNet;
    }

    public BigDecimal getAssetsCurrent() {
        return AssetsCurrent;
    }

    public void setAssetsCurrent(BigDecimal assetsCurrent) {
        AssetsCurrent = assetsCurrent;
    }

    public BigDecimal getLiabilitiesCurrent() {
        return LiabilitiesCurrent;
    }

    public void setLiabilitiesCurrent(BigDecimal liabilitiesCurrent) {
        LiabilitiesCurrent = liabilitiesCurrent;
    }

    public BigDecimal getLiabilitiesAndStockHolderEquity() {
        return LiabilitiesAndStockHolderEquity;
    }

    public void setLiabilitiesAndStockHolderEquity(BigDecimal liabilitiesAndStockHolderEquity) {
        LiabilitiesAndStockHolderEquity = liabilitiesAndStockHolderEquity;
    }

    public BigDecimal getCashAndCashEquivalentAtCarryingValue() {
        return CashAndCashEquivalentAtCarryingValue;
    }
    public void setCashAndCashEquivalentAtCarryingValue(BigDecimal cashAndCashEquivalentAtCarryingValue) {
        CashAndCashEquivalentAtCarryingValue = cashAndCashEquivalentAtCarryingValue;
    }



}
