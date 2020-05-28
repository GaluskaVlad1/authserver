package auth.server.authserver;

import org.springframework.data.annotation.Id;

public class Account {
    @Id
    public String id;

    public String username;
    public String password;

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String toString(){
        return username+","+password;
    }
}
