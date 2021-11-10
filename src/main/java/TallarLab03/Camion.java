package TallarLab03;

import java.util.Vector;
import TallarLab03.Flete;

public class Camion {
	private String _codigoID;
	private String _patente;
	private boolean _estado;
	private String _descripcion;
	public Vector<Flete> _unnamed_Flete_ = new Vector<Flete>();
	public Sucursal _unnamed_Sucursal_;

	public int getDescripcion() {
		throw new UnsupportedOperationException();
	}

	public void setDescripcion(int aDescripcion) {
		throw new UnsupportedOperationException();
	}

	public boolean getEstado() {
		return this._estado;
	}

	public void setEstado(boolean aEstado) {
		this._estado = aEstado;
	}

	public String getPatente() {
		return this._patente;
	}

	public void setPatente(String aPatente) {
		this._patente = aPatente;
	}

	public String getCodigoID() {
		return this._codigoID;
	}

	public void setCodigoID(String aCodigoID) {
		this._codigoID = aCodigoID;
	}
}