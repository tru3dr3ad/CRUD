package modelo;

/**
 *
 * @author Kristal
 */
public class Disco {

    private int id_disco, precio, id_proveedor;
    private String nombre, autor, genero, resultado;

    public Disco() {
    }

    public Disco(int id_disco, int precio, int id_proveedor, String nombre, String autor, String genero) {
        this.id_disco = id_disco;
        this.precio = precio;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }

    public int getId_disco() {
        return id_disco;
    }

    public void setId_disco(int id_disco) {
        this.id_disco = id_disco;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
