package TallarLab03;

import java.util.ArrayList;
import java.util.Vector;
import TallarLab03.Producto;

public class Flete {
	private String _codigoID;
	private Producto _descripcion;
	public Camion _unnamed_Camion_;
	public ArrayList<Producto> _unnamed_Producto_ = new ArrayList<Producto>();

	public String getCodigoID() {
		return this._codigoID;
	}

	public void setCodigoID(String aCodigoID) {
		this._codigoID = aCodigoID;
	}

	public Producto getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(Producto aDescripcion) {
		this._descripcion = aDescripcion;
	}
}