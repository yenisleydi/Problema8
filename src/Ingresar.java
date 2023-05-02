import java.util.Scanner;

public class Ingresar {
    public void ingresar(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese los datos del remitente:");
        System.out.print("Nombres: ");
        String nombresRem = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidosRem = scanner.nextLine();
        System.out.print("Número de documento de identidad: ");
        int numeroDocumentoRem = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionRem = scanner.nextLine();
        System.out.print("Teléfono: ");
        int telefonoRem = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese los datos del destinatario:");
        System.out.print("Nombres: ");
        String nombresDest = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidosDest = scanner.nextLine();
        System.out.print("Número de documento de identidad: ");
        int numeroDocumentoDest = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionDest = scanner.nextLine();
        System.out.print("Teléfono: ");
        int telefonoDest = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nIngrese los detalles del paquete:");
        System.out.print("Tipo de envío (nacional o internacional): ");
        String tipoEnvio = scanner.nextLine();
        System.out.print("Contenido (documento o mercancía): ");
        String contenido = scanner.nextLine();
        System.out.print("Peso (en kg): ");
        double peso = scanner.nextDouble();

        PaqueteDeEnvio paquete = new PaqueteDeEnvio(nombresRem, apellidosRem, numeroDocumentoRem, direccionRem, telefonoRem,
                nombresDest, apellidosDest, numeroDocumentoDest, direccionDest, telefonoDest,
                tipoEnvio, contenido, peso);

        double valorEnvio = paquete.calcularValorEnvio();
        System.out.printf("\nEl valor del envío es de $%,.2f", valorEnvio);
    }
}
