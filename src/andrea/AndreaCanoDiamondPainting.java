package andrea;

public class AndreaCanoDiamondPainting {

	public String guia;
	public int diamantes;
	public String nombre;
	public int boli;
	public AndreaCanoDiamondPainting(String guia, int diamantes, String nombre,int boli) {
		this.guia=guia;
		this.diamantes=diamantes;
		this.nombre=nombre;
		this.boli=boli;//
	}
	public String getGuia() {
		return guia;
	} //
	public int getDiamantes() {
		return diamantes;
	} 
	public String getNombre() {
	return nombre;
	} 
	public int getBoli() {
	return boli;
	} 
	public void setGuia(String guia) {
		this.guia=guia;//
	}
	public void setDiamantes(int diamantes) {
		this.diamantes=diamantes;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setBoli(int boli) {
		this.boli=boli;//
	}
}
