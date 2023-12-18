import java.util.Scanner;
public class UsAlma {

    // UsAlma sınıfında usAlma isminde bir method belirledik.
    // bu metod statik olmadığı için main methodunun içinde yeni bir obje oluşturduk ve
    // bu objenin  sayesinde usAlme methodunu çağırdık
    public int  usAlma(int a, int b){
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

        UsAlma sonuc = new UsAlma();
        int result = sonuc.usAlma(base,exponential);

        System.out.print(base+" üzeri "+exponential+" :  "+result);
//sonda da bastırıyoruz
    }
}
