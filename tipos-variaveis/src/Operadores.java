import javax.management.monitor.StringMonitorMBean;

public class Operadores {
    
    public static void main(String[] args) {
       // String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);
        //String concatenacao = "?";
        //concatenacao = 1+1+1+"1";
        //System.out.println(concatenacao);
        //concatenacao = 1+"1"+1+1;
        //System.out.println(concatenacao);
        //concatenacao = 1+"1"+1+"1";
        //System.out.println(concatenacao);
        //concatenacao = "1"+1+1+1;
        //System.out.println(concatenacao);
        //concatenacao = "1"+(1+1+1);
        //System.out.println(concatenacao);

        //int numero = 5;
        //System.out.println(- numero);
        //System.out.println(numero);

        //numero = numero + 2;
        //System.out.println(numero);

        /*boolean variavel = true;

        System.out.println(variavel);
        System.out.println(!variavel);*/
        /*int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        int resultado = a == b ? 1 : 0;
        System.out.println(resultado);*/

        /*int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);*/

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}
