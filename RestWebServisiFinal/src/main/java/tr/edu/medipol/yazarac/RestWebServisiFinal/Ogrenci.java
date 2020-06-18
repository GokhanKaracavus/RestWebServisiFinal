package tr.edu.medipol.yazarac.RestWebServisiFinal;

public class Ogrenci {

	private String isim;
	private long numara;
	public Ogrenci(String isim, long numara) {
		super();
		this.isim = isim;
		this.numara = numara;
	}
	public String getIsim() {
		return isim;
	}
	public long getNumara() {
		return numara;
	}
	
	
}
