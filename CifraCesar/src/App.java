import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao codificador e decoficador de Cesar");
        System.out.println("Para codificar um código escolha 1, para decoficar escolha 2: ");
        int escolha;

        do  {
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Escolhido codificar");
                System.out.println("Digite a frase que deseja codificar: ");
                sc.nextLine();
                String frase = sc.nextLine();
                System.out.print("Agr digite a chave utiliza para codificar: ");
                int chave = sc.nextInt();
                System.out.println(codificar(frase, chave));
              
            }else if (escolha == 2) {
                System.out.println("Escolhido decoficar");
                System.out.println("Digite a frase que deseja decodificar: ");
                sc.nextLine();
                String frase = sc.nextLine();
                System.out.print("Agr digite a chave utiliza para decodificar: ");
                int chave = sc.nextInt();
                System.out.println(decodificar(frase, chave));
            } else {
                System.out.println("escolha um numero válido");   
            }
            
        } while (escolha < 0 || escolha > 2 );


        sc.close();
    }

    public static String codificar(String frase, int chave) {
        
        frase = frase.toLowerCase();
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String fraseCodificada = "";
        
        for(int i = 0; i < frase.length(); i++) {
            
            char posicaoLetraFrase = frase.charAt(i);
            
            for (int j = 0; j < 26; j++){

                if (posicaoLetraFrase == ' ') {
                    fraseCodificada+=' ';
                    break;
                } else if (posicaoLetraFrase == alfabeto[j]) {
                    fraseCodificada += alfabeto[j+chave];
                }   
            }
        }
        return fraseCodificada;        
    }

    public static String decodificar(String frase, int chave) {
        frase = frase.toLowerCase();
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String fraseDecodificada = "";
        
        for(int i = 0; i < frase.length(); i++) {
            
            char posicaoLetraFrase = frase.charAt(i);
            
            for (int j = 0; j < 26; j++){

                if (posicaoLetraFrase == ' ') {
                    fraseDecodificada+=' ';
                    break;
                } else if (posicaoLetraFrase == alfabeto[j]) {
                    fraseDecodificada += alfabeto[j-chave];
                }   
            }
        }
        return fraseDecodificada; 
    }
}
