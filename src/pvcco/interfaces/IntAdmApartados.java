
package pvcco.interfaces;

import java.util.List;
import objetosNegocio.Apartado;

/**
 *
 * @author Raul Karim Sabag Ballesteros
 */
public interface IntAdmApartados {
    public Apartado obten(Apartado apartado) throws Exception;
    public void realizarApartado(Apartado apartado) throws Exception;
    public void cancelarApartado(Apartado apartado) throws Exception;
    public void abonarApartado(Apartado apartado, float cantidadAbonara) throws Exception;
    public void modificarApartado(Apartado apartado) throws Exception;
    public List<Apartado> obtenApartadosRegistrados() throws Exception;
}
