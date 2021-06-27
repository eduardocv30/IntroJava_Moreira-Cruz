import java.util.Scanner;

class CalculadoraSimple {
    public static void main(String[] args)
    {
        Scanner lr= new Scanner(System.in);
        double num1=0;
        System.out.println("Escriba el número de la operación que desea realizar");

        System.out.println("(1) Para Operaciones trigonométricas");
        System.out.println("(2) Para Operaciones trigonométricas inversas");
        System.out.println("(3) Para Operaciones trigonométricas  hiperbólicas");
        char opcion = lr.next().charAt(0);

        switch(opcion)
        {
            case '1':
                System.out.println("Operaciones trigonométricas");
                System.out.println("Ingrese el ángulo: ");
                num1=lr.nextDouble();
                double b = Math.toRadians(num1);
                System.out.println("Seno: " + Math.sin(b));
                System.out.println("Coseno: " + Math.cos(b));
                System.out.println("Tangente: " + Math.tan(b));
                break;
            case '2':
                System.out.println("Operaciones trigonométricas inversas");
                System.out.println("Ingrese el ángulo: ");
                num1=lr.nextDouble();
                double Arcoseno = Math.asin(num1);
                double angulo2 = Math.toDegrees(Arcoseno);
                System.out.println("Arcoseno: "+(angulo2));
                double Arcocoseno = Math.acos(num1);
                double angulo = Math.toDegrees(Arcocoseno);
                System.out.println("Arcocoseno: "+(angulo));
                double Arcotangente = Math.atan(num1);
                double angulo3 = Math.toDegrees(Arcotangente);
                System.out.println("Arcotangente: "+(angulo3));
                break;
            case '3':
                System.out.println("Operaciones trigonométricas parabolicas");
                System.out.println("Ingrese el ángulo: ");
                num1=lr.nextDouble();
                System.out.println("Resultado: "+(num1));
                break;
                
            

        }
    }

}