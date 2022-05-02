import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner teclado;
    private List<Usuario> usuarios;
    private List<Zapatillas> zapatillas;

    public Menu () {
        teclado = new Scanner(System.in);
        usuarios = new ArrayList<>();
        zapatillas = new ArrayList<>();
    }

    public void MostrarMenu () {

        String opcion = null;



        do {
            System.out.println("Menu principal Zapatilla");
            System.out.println("1. Añadir zapatilla");
            System.out.println("2. Ver zapatillas");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion =teclado.nextLine();

            switch (opcion) {
                case "1":
                    addZapatilla();
                    break;
                case "2":
                    verZapatillas();
                    break;
                case "3":
                    addUsuario();
                    break;
                case "4":
                    verUsuarios();
            }
        } while (!opcion.equals("5"));
    }

    public void addZapatilla(){
        System.out.println("Introduce los datos de la zapatilla que quieres añadir");
        System.out.println("Id:");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Modelo:");
        String modelo = teclado.nextLine();
        System.out.println("Numero:");
        int numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Precio:");
        double precio = Double.parseDouble(teclado.nextLine());
        Zapatillas zapatilla = new Zapatillas(id,modelo,numero,precio);
        zapatillas.add(zapatilla);
    }

    public void verZapatillas(){
        for (Zapatillas zapatillas : zapatillas) {
            System.out.println("Id: " + zapatillas.getId() + " / Modelo: " + zapatillas.getModelo() + " / Numero: " + zapatillas.getNumero() + " / Precio: " + zapatillas.getPrecio());
        }

    }

    public void addUsuario(){
        System.out.println("Introduce los datos de usuario");
        System.out.println("Id:");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Apellido:");
        String apellido = teclado.nextLine();
        System.out.println("Nombre Usuario:");
        String nombreUsuario = teclado.nextLine();
        System.out.println("Password:");
        String password = teclado.nextLine();
        System.out.println("Teléfono:");
        int telefono = Integer.parseInt(teclado.nextLine());

        Usuario usuario = new Usuario();
        usuarios.add(usuario);
    }

    public void verUsuarios(){
        for (Usuario usuario : usuarios) {
            System.out.println("Id: " + usuario.getId() + " / Nombre: " + usuario.getNombre() + " / Apellido: " + usuario.getApellido() +
                    " / Nombre usuario: " + usuario.getNombreUsuario() + " / Password: " + usuario.getPassword() + " / Teléfono: " + usuario.getTelefono());
        }

    }


}
