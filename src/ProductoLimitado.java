
public class ProductoLimitado extends Producto {
	public ProductoLimitado(double precio, int nroProducto, int stock) {
		super(precio, nroProducto);
		this.stock = stock;
	}

	protected int stock;
	
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public double getPrecio() {
		if(this.stock < 1000) {
			return super.getPrecio() * 1.5;
		}else if(this.stock < 100) {
			return super.getPrecio() * 2;
		}
		
		return super.getPrecio()
;	}
	
}
