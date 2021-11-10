package TallarLab03;

import java.util.Vector;
import TallarLab03.Producto;

public class Flete {
	private String _codigoID;
	private producto _descripcion;
	public Camion _unnamed_Camion_;
	public Vector<Producto> _unnamed_Producto_ = new Vector<Producto>();

	public String getCodigoID() {
		return this._codigoID;
	}

	public void setCodigoID(String aCodigoID) {
		this._codigoID = aCodigoID;
	}

	public producto getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(producto aDescripcion) {
		this._descripcion = aDescripcion;
	}
}