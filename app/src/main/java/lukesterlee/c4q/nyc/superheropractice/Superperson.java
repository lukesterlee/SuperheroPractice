package lukesterlee.c4q.nyc.superheropractice;

import java.util.List;

/**
 * Created by Willee on 6/11/15.
 */
public abstract class Superperson {

    private String name;
    private String secretIdentity;
    private List<String> powersList;
    private String pictureUrl;
    private String nemesis;


    public Superperson() {
    }

    public Superperson(String name) {
        this.name = name;
    }

    public Superperson(String name, List<String> powersList, String secretIdentity, String nemesis) {
        this.name = name;
        this.powersList = powersList;
        this.secretIdentity = secretIdentity;
        this.nemesis = nemesis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPowersList() {
        return powersList;
    }

    public void setPowersList(List<String> powersList) {
        this.powersList = powersList;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNemesis() {
        return nemesis;
    }

    public void setNemesis(String nemesis) {
        this.nemesis = nemesis;
    }
}
