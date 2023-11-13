package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private long code;
    private double solde;

    @XmlElement
    private String date_creation;

    public Compte() {
        super();
    }

    public Compte(long code, double solde, String date_creation) {
        this.code = code;
        this.date_creation = date_creation;
        this.solde = solde;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @XmlTransient
    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public double getSolde() {
        return solde;
    }

    public String getDate_creation() {
        return date_creation;
    }
}
