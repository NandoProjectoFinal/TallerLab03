package TallarLab03;

import java.util.Vector;
import TallarLab03.Camion;

public class Sucursal {
	private String _codigo;
	private String _region;
	public Vector<Camion> _unnamed_Camion_ = new Vector<Camion>();
	public Empresa _unnamed_Empresa_;

	public String getCodigo() {
		return this._codigo;
	}

	public void setCodigo(String aCodigo) {
		this._codigo = aCodigo;
	}

	public String getRegion() {
		return this._region;
	}

	public void setRegion(String aRegion) {
		this._region = aRegion;
	}
}