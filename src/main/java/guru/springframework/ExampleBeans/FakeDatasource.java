package guru.springframework.ExampleBeans;

public class FakeDatasource {


    private String username;
    private String password;
    private String url;


    public String getUsernmae() {
        return username;
    }

    public void setUsernmae(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
