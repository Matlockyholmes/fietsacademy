package be.vdab.fietsacademy.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    private String straat;
    private String huisnr;
    private String postcode;
    private String gemeente;

    protected Adres() {

    }

    public Adres(String straat, String huisnr, String postcode, String gemeente) {
        this.straat = straat;
        this.huisnr = huisnr;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisnr() {
        return huisnr;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getGemeente() {
        return gemeente;
    }
}
