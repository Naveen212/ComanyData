import java.util.ArrayList;

/**
 * Created by naveengaur on 21/4/18.
 */

public class CompanyIdentifiers {
    private String ticker;
    private String name;
    private String  cik;
     private ArrayList<XbrlElements>mXbrlElements;
     private ArrayList<Ratios>mRatios;
    public CompanyIdentifiers(String ticker,String name,String cik)
    {
        this.ticker=ticker;
        this.name=name;
        this.cik=cik;
        mXbrlElements=new ArrayList<>();
        mRatios=new ArrayList<>();

    }

    public String getTicker()
    {
        return ticker;
    }
    public String getName()
    {
        return name;
    }
    public String getCik()
    {
        return cik;
    }



}
