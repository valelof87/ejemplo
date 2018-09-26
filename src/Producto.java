
public class Producto {
	protected double precio;
	protected int nroProducto;
	protected int iva;
	
	public Producto (double precio, int nroProducto) {
		this.precio = precio;
		this.nroProducto = nroProducto;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getNroProducto() {
		return nroProducto;
	}
	
	public void setNroProducto (int nroProducto) {
		this.nroProducto = nroProducto;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
}
