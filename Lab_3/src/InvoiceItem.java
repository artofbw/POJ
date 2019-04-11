// EXERCISES 03_02
// Praca w parach: Damian Brzoskowski s18499, Łukasz Ćwikliński s19334


public class InvoiceItem
{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;


    public InvoiceItem(
            String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty  = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice*qty;
    }


    public String toString()
    {
        return("InvoiceItem[id="+ this.getId() + ",desc=" + this.getDesc() +
                ",qty=" + this.getQty() + ",unitPrice=" + this.getUnitPrice() + "]");
    }


    public static void main(String[] args)
    {
        InvoiceItem InvoiceObj = new InvoiceItem("1", "Opis obiektu", 3, 33);
        System.out.println("Inicjowanie obiektu z wartosciami");
        System.out.println(InvoiceObj.toString());
        System.out.println(InvoiceObj.getTotal());
        System.out.println(InvoiceObj.getUnitPrice());
        System.out.println("Zmiana wartosci dla qty i unitPrice");
        InvoiceObj.setQty(5);
        InvoiceObj.setUnitPrice(55);
        System.out.println(InvoiceObj.toString());
        System.out.println(InvoiceObj.getTotal());
        System.out.println(InvoiceObj.getUnitPrice());

    }
} 