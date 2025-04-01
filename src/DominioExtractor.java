public class DominioExtractor {
    private String email;
    private String site;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmailInput() {
        return email;
    }

    public void setEmailInput(String emailInput) {
        this.email = emailInput;
    }

    public String extrairDominioEmail (String email) {
        return email.split("@")[1].trim().toLowerCase();
    }

    public String normalizarDominioSite (String site){
        return site.replace("https://", " ").replace("http://", " ").replace("www.", " ");
    }

}
