package Models;

import java.util.List;

public class BrandsResponseParam {
	
	public void setBiu(String biu) {
		this.biu = biu;
	}
	public void setPli(String pli) {
		this.pli = pli;
	}
	public void setPln(String pln) {
		this.pln = pln;
	}
	public void setDt(List<dt> dt) {
		this.dt = dt;
	}
	private String biu;
	private String pli;
	private String pln;
    List<dt> dt;
	public String getBiu() {
		return biu;
	}
	public String getPli() {
		return pli;
	}
	public String getPln() {
		return pln;
	}
	public List<dt> getDt() {
		return dt;
	}


}
