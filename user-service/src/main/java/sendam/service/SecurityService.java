package sendam.service;

/**
 * Created by ayansolaakanmu on 24/12/2017.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);

}
