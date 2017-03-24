
package pvcco.interfaces;

import java.util.List;
import objetosNegocio.Apartado;
import objetosNegocio.BajaDeInventario;
import objetosNegocio.Modelo;
import objetosNegocio.MovimientoEnApartado;
import objetosNegocio.Talla;
import objetosNegocio.TallaApartado;

/**
 *
 * @author Raul Karim Sabag Ballesteros GAY
 */
public interface IntPersistencia {
    public void agregar(TallaApartado talla) throws Exception;
    public void actualizar(TallaApartado talla) throws Exception;
    public void eliminar(TallaApartado talla) throws Exception;
    
    public void agregar(MovimientoEnApartado mov) throws Exception;
    public void actualizar(MovimientoEnApartado mov) throws Exception;
    public void eliminar(MovimientoEnApartado mov) throws Exception;
    
    public void agregar(Apartado apartado) throws Exception;
    public void modificar(Apartado apartado) throws Exception;
    public void eliminar(Apartado apartado) throws Exception;
    
    public void agregar(Talla talla) throws Exception;
    public void eliminar(Talla talla) throws Exception;
    public void actualizar(Talla talla) throws Exception;
    
    public void agregar(Modelo modelo) throws Exception;
    public void eliminar(Modelo modelo) throws Exception;
    public void actualizar(Modelo modelo) throws Exception;
    
    public void agregar(BajaDeInventario baja) throws Exception;
    public void actualizar(BajaDeInventario baja) throws Exception;
    public void eliminar(BajaDeInventario baja) throws Exception;
    
    public Talla obten(Talla talla) throws Exception;
    public Modelo obten(Modelo modelo) throws Exception;
    public Apartado obten(Apartado apartado) throws Exception;
    public TallaApartado obten(TallaApartado talla) throws Exception;
    public BajaDeInventario obten(BajaDeInventario baja) throws Exception;
    public MovimientoEnApartado obten(MovimientoEnApartado mov) throws Exception;
    
    public List<TallaApartado> obtenTallasApartadas() throws Exception;
    public List<MovimientoEnApartado> obtenAbonosRegistrados() throws Exception;
    public List<BajaDeInventario> obtenBajasDeInventario() throws Exception;
    public List<Modelo> obtenModelos() throws Exception;
    public List<Apartado> obtenApartados() throws Exception;
    public List<Talla> obtenTallas() throws Exception;
    
    public Talla obtenTallaPorTalla(Talla talla) throws Exception;
    public Modelo obtenModeloPorNombre(Modelo modelo) throws Exception;
}
