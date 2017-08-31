/**
 * Created by jc345932 on 31/08/17.
 */
public class UseBook {
    public static void main(String [] args) {
        Fiction book1 = new Fiction("22222");
        NonFiction book2 = new NonFiction("3333");
        System.out.println("Fiction "+book1.getbooktitle()+" costs $"+book1.getPrice());
        System.out.println("Non-Fiction "+book2.getbooktitle()+" costs $"+book2.getPrice());
    }
}
