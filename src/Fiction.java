/**
 * Created by jc345932 on 31/08/17.
 */
public class Fiction extends Book{
    public Fiction (String booktitle){
        super(booktitle);
        setPrice();
    }
    @Override
    public void setPrice(){
        super.price = 24.99;
    }
}
