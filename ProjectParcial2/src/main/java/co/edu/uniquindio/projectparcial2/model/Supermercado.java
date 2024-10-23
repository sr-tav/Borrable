package co.edu.uniquindio.projectparcial2.model;

import co.edu.uniquindio.projectparcial2.controller.CarritoController;
import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectparcial2.service.ICrudProducto;

import java.util.ArrayList;
import java.util.List;

public class Supermercado implements ICrudProducto {
  private String nombre;
  List<CarritoCompras> listCarritoCompras = new ArrayList<>();
  List<Cliente> listClientes = new ArrayList<>();
  List<Producto> listProductos = new ArrayList<>();
  List<Proveedor> listProveedores = new ArrayList<>();

  public Supermercado() {
  }

  public Supermercado(String nombre) {
    this.nombre = nombre;
  }

  //------------------------------- CRUD PRODUCTO -----------------------
  @Override
  public boolean crearProducto(Producto newProducto) {
    if (newProducto != null) {
      getListProductos().add(newProducto);
      return true;
    }
    return false;
  }

  @Override
  public boolean eliminarProducto(String id) {
    for (Producto producto : getListProductos()) {
      if (producto.getIdProducto().equals(id)) {
        getListProductos().remove(producto);
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean actualizarProducto(String idProducto, Producto producto) {

    Producto productoExistente = buscarProducto(idProducto);

    if (productoExistente != null) {
      productoExistente.setIdProducto(producto.getIdProducto());
      productoExistente.setNombre(producto.getNombre());
      productoExistente.setPrecio(producto.getPrecio());
      productoExistente.setCantDisponible(producto.getCantDisponible());


      return true;
    }

    return false;
  }

  @Override
  public Producto buscarProducto(String id) {
    for (Producto producto : listProductos) {
      if (producto.getIdProducto().equals(id)) {
        return producto;
      }
    }
    return null;
  }


  @Override
  public boolean verificarProductoExistente(String idProducto) {
    Producto productoExistente = null;
    for (Producto producto : listProductos) {
      if (producto.getIdProducto().equals(idProducto)) {
        productoExistente = producto;
        break;
      }
    }

    if (productoExistente == null) {
      return true;
    }
    return false;
  }
  public void buscarProductosEnRango(int inferior, int superior){
    int cont=0;
    for (Producto producto : listProductos) {
      if (producto.getPrecio()>=inferior && producto.getPrecio()<=superior){
          cont++;
      }
    }
    System.out.println("Numero de productos en el rango de "+inferior+"/"+superior+" : "+cont);
  }
  public void pagarCarrito(String id){
    for (CarritoCompras compras : listCarritoCompras) {
      if (compras.getIdCarrito().equals(id)) {
        System.out.println(compras.toString());
        break;
      }
    }
  }
//------------------------------- CRUD PRODUCTO -----------------------


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<CarritoCompras> getListCarritoCompras() {
    return listCarritoCompras;
  }

  public void setListCarritoCompras(List<CarritoCompras> listCarritoCompras) {
    this.listCarritoCompras = listCarritoCompras;
  }

  public List<Cliente> getListClientes() {
    return listClientes;
  }

  public void setListClientes(List<Cliente> listClientes) {
    this.listClientes = listClientes;
  }

  public List<Producto> getListProductos() {
    return listProductos;
  }

  public void setListProductos(List<Producto> listProductos) {
    this.listProductos = listProductos;
  }

  public List<Proveedor> getListProveedores() {
    return listProveedores;
  }

  public void setListProveedores(List<Proveedor> listProveedores) {
    this.listProveedores = listProveedores;
  }

}
