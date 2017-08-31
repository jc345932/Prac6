/**
 * Created by jc345932 on 31/08/17.
 */
public class NonFiction extends Book{
    public NonFiction(String booktitle)
    {
        super(booktitle);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}
