package TallarLab03;

import java.util.Vector;
import TallarLab03.Sucursal;

public class Empresa {
	private String _nombre;
	private String _direccion;
	public Vector<Sucursal> _unnamed_Sucursal_ = new Vector<Sucursal>();
	public MetodosP _unnamed_MetodosP_;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}
}