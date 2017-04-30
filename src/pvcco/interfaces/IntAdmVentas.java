/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvcco.interfaces;

import java.util.List;
import objetosNegocio.Talla;
import objetosNegocio.Usuario;

/**
 *
 * @author zippy
 */
public interface IntAdmVentas {
    public void realizarVenta(List<Talla> tallas, List<Integer> cantidades, float totalVenta);
    public void agregarVentaPorApartadoLiquidado(List<Talla> tallas, List<Integer> cantidades, float cantidadPagada);
}
