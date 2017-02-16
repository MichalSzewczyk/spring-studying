package msg;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 * Class created to show, that it is possible to use spring configuration not only
 * for dependency injection but also for configuring beans
 */
public class MessagingClass {
    private String host;
    private String username;
    private String password;
    private int id;

    public String getHost() {
        return host;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
}
