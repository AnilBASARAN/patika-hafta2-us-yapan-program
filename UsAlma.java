import java.util.Scanner;
public class UsAlma {


   
    public static int  usAlanMetod(int a, int b){
        int result = 1;
    for(int i = 1;i <=b;i++){
        result *= a;
        }
    return result;
    }

    public static void main(String[] args) {
        int base,exponential;
        Scanner input = new Scanner(System.in);

        // base ve exponential degiskenlerinde saklıyoruz kullanıcıdan aldığımız değerleri

        System.out.print("Üssü alınacak sayıyı girin:   ");
        base = input.nextInt();

        System.out.print("Üssü girin:   ");
        exponential = input.nextInt();

     
        int result = usAlma.usAlanMetod(base,exponential);

        System.out.print(base+" üzeri "+exponential+" :  "+result);
//sonda da bastırıyoruz
    }
}
