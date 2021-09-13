import javax.swing.JOptionPane;

public class ATM {
    public static void main(String args[]) {

        boolean running = true;
        int dineroTotal = 0;
        String [] opciones = {"Depositar", "Retirar", "Transferir", "Consultar saldo", "Salir"};
        
        while (running == true) {
            
            int opcion = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Welcome to ATM", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            
            switch (opcion) {
                
                case 0:
                    
                    int dineroDeposito = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero desea depositar?:"));
                    dineroTotal += dineroDeposito;
                    System.out.println("Acaban de depositar " + dineroDeposito + " soles a su cuenta.");
                    System.out.println("Dinero actual: " + dineroTotal + " soles.");
                    
                    break;
                    
                case 1:
                    
                    int dineroRetiro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero desea retirar?:"));
                    if (dineroTotal < dineroRetiro) {
                        
                        System.out.println("Usted no tiene esa cantidad de dinero!");
                        
                    }
                    
                    else {
                        
                        dineroTotal -= dineroRetiro;
                        System.out.println("Acaban de retirar " + dineroRetiro + " soles a su cuenta.");
                        System.out.println("Dinero actual: " + dineroTotal + " soles.");
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    String receptor = JOptionPane.showInputDialog("¿A quien desea transferirle dinero?:");
                    int dineroTransferencia = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea transferirle a " + receptor + "?"));
                    if (dineroTotal < dineroTransferencia) {
                        
                        System.out.println("Usted no tiene esa cantidad de dinero!");
                        
                    }
                    
                    else {
                        
                        dineroTotal -= dineroTransferencia;
                        System.out.println("Acaban de transferir " + dineroTransferencia + " soles a " + receptor);
                        System.out.println("Dinero actual: " + dineroTotal + " soles.");
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Tu saldo actual es de: " + dineroTotal + " soles.");
                    break;
                    
                default:
                    
                    running = false;
                    break;
                    
            }
            
        }

    }
}