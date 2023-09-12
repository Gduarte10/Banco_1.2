public class Banco {
    
    public static void main(String[] args) {
    
        Conta a = new Conta("1020-0101");
    
        a.depositar(100);
    
        a.depositar(200);
    
        System.out.println(a.saldo);
    
    }
    
    }
    