/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {
        // Test 1: Usar el constructor por defecto
        trigo trigoDefault = new trigo();
        System.out.println("Trigo por defecto:");
        System.out.println("Icono: " + trigoDefault.getIcono());
        System.out.println("Duración de producción: " + trigoDefault.getDuracionProduccion());
        System.out.println("Experiencia al recolectar: " + trigoDefault.getExperienciaRecolecta());
        System.out.println("Precio de venta: " + trigoDefault.getPrecioVenta());
        System.out.println("Riego: " + trigoDefault.getRiego());

        // Test 2: Usar el constructor paramétrico
        trigo trigoParametrico = new trigo("/img/trigo_diferente.png", 3, 2, 5, 15);
        System.out.println("\nTrigo con constructor paramétrico:");
        System.out.println("Icono: " + trigoParametrico.getIcono());
        System.out.println("Duración de producción: " + trigoParametrico.getDuracionProduccion());
        System.out.println("Experiencia al recolectar: " + trigoParametrico.getExperienciaRecolecta());
        System.out.println("Precio de venta: " + trigoParametrico.getPrecioVenta());
        System.out.println("Riego: " + trigoParametrico.getRiego());

        // Test 3: Usar el constructor copia
        trigo trigoCopia = new trigo(trigoParametrico);
        System.out.println("\nTrigo copia:");
        System.out.println("Icono: " + trigoCopia.getIcono());
        System.out.println("Duración de producción: " + trigoCopia.getDuracionProduccion());
        System.out.println("Experiencia al recolectar: " + trigoCopia.getExperienciaRecolecta());
        System.out.println("Precio de venta: " + trigoCopia.getPrecioVenta());
        System.out.println("Riego: " + trigoCopia.getRiego());

        // Test 4: Modificar valores
        trigoCopia.setPrecioVenta(10);
        trigoCopia.setRiego(20);
        System.out.println("\nTrigo copia después de modificar valores:");
        System.out.println("Precio de venta modificado: " + trigoCopia.getPrecioVenta());
        System.out.println("Riego modificado: " + trigoCopia.getRiego());
    }
}

