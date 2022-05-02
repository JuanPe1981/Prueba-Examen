public class Zapatillas {

    int id;
    String modelo;
    int numero;
    double precio;

    public Zapatillas(){

    }

    public Zapatillas(int id, String modelo, int numero, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.numero = numero;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
