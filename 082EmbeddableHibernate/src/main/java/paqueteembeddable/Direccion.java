package paqueteembeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Direccion {

private String calle, numero, municipio;


public Direccion() {

}


public Direccion(String calle, String numero, String municipio) {
	super();
	this.calle = calle;
	this.numero = numero;
	this.municipio = municipio;
}

public String getCalle() {
	return calle;
}

public void setCalle(String calle) {
	this.calle = calle;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getMunicipio() {
	return municipio;
}

public void setMunicipio(String municipio) {
	this.municipio = municipio;
}


@Override
public String toString() {
	return "Direccion [calle=" + calle + ", numero=" + numero + ", municipio=" + municipio + "]";
}


}