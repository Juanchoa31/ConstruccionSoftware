package clubSocial;

public class Partner {
    protected int idSocio;
    protected String nombreSocio;
		
    public Partner() {	
    }		
		
    public Partner(int idSocio, String nombreSocio) {
	this.idSocio = idSocio;
	this.nombreSocio = nombreSocio;
    }
		
    /**
     * @return the idSocio
     */
    public int getIdSocio() {
	return idSocio;
    }

    /**
     * @param idSocio the idSocio to set
     */
    public void setIdSocio(int idSocio) {
	this.idSocio = idSocio;
    }

    /**
     * @return the nombreSocio
     */
    public String getNombreSocio() {
	return nombreSocio;
    }

    /**
     * @param nombreSocio the nombreSocio to set
     */
    public void setNombreSocio(String nombreSocio) {
	this.nombreSocio = nombreSocio;
    }
}
