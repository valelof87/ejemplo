
public class ProductoConVencimiento extends Producto {
	protected boolean vencido;
	
	
	public ProductoConVencimiento(double precio, int nroProducto,boolean vencido) {
		super(precio, nroProducto);
		this.vencido = vencido;
		
	}

	
	@Override
	public double getPrecio() {
		if (vencido == true) {
			return super.getPrecio() * 0.75;
		}
		return super.getPrecio();
	}
	

}
