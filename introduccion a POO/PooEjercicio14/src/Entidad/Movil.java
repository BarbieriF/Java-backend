//Crear una entidad Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo.
//El atributo código será
//un arreglo numérico de dimensión 7 (siete)
package Entidad;

import java.util.Arrays;

/**
 *
 * @author franc
 */
public class Movil {
    private String marca;
    private Double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int [] codigo;

    public Movil() {
    }

    public Movil(String marca, Double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
    
}
