
package pvcco.interfaces;

import java.util.List;
import objetosNegocio.Apartado;
import objetosNegocio.Modelo;
import objetosNegocio.Talla;

/**
 *
 * @author Raul Karim Sabag Ballesteros
 */
public interface IntAdmInventario {
    public void agregarProductoAInventario(Talla talla) throws Exception;
    public void bajaEnInventario(List<Talla> productos, List<Integer> cantidades, String descripcion) throws Exception;
    public void movimientoEnInventarioPorVenta(List<Talla> productos, List<Integer> cantidades);
    public void modificarPorApartadoCancelado(Apartado apartado) throws Exception;
    public void modificarPorApartadoAgregado(Apartado apartado) throws Exception;
    public void modificarPorApartadoLiquidado(Apartado apartado) throws Exception;

    public Talla obten(Talla talla) throws Exception;
    public Modelo obten(Modelo modelo) throws Exception;
    public List<Talla> obtenListaTallas() throws Exception;
    public List<Modelo> obtenListaModelos() throws Exception;
}
