package be.vdab.fietsacademy.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adres)) return false;
        Adres adres = (Adres) o;
        return Objects.equals(straat, adres.straat) &&
                Objects.equals(huisnr, adres.huisnr) &&
                Objects.equals(postcode, adres.postcode) &&
                Objects.equals(gemeente, adres.gemeente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(straat, huisnr, postcode, gemeente);
    }
}
