import java.net.InetAddress;

public class DominioChecker {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String emailDivider (String email){
        return email.split("@")[1].trim().toLowerCase();
    }

    c

    }
}
