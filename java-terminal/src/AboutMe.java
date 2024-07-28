
    import java.util.Locale;
    import java.util.Scanner;

     // Recebendo dados do usuario utilizando a classe Scanner

public class AboutMe {
   
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
    
        //imprimindo os dados do usuario
        System.out.println("Ola, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho: " + idade + " anos ");
        System.out.println("Minha altura: " + altura + " cm ");
    }
}



//Recebendo dados do usuario
/* 
public class AboutMe {
    public static void main(String[] args) {
          
         String nome = args [0];
         String sobrenome = args [1];
         int idade = Integer.valueOf(args[2]);
         double altura = Double.valueOf(args[3]);
    
        System.out.println("Olá, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
*/
