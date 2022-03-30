import java.util.Scanner;
public class Task4_Wednesday_30_March {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter what type is the article here: ");
        String clothes = "Clothes";
        String shoes = "Shoes";
        String article = read.next();
        if(article.equalsIgnoreCase(clothes)){
            System.out.println("The article is clothes. What is the regular price?");
            double price = read.nextDouble();
            double afterDiscount = price - price*0.2;
            System.out.println("You have to pay final: "+afterDiscount+" BGN.");
        } else if(article.equalsIgnoreCase(shoes)){
            System.out.println("The article is shoes. What is the regular price?");
            double price1 = read.nextDouble();
            double afterDiscount1 = price1 - price1*0.1;
            System.out.println("You have to pay final: "+afterDiscount1+" BGN.");
        } else {
            System.out.println("The article is not shoes, nor clothes. What is the regular price?");
            double price2 = read.nextDouble();
            double afterDiscount2 = price2 - price2*0.05;
            System.out.println("You have to pay final: "+afterDiscount2+" BGN.");
        }
    }
}
