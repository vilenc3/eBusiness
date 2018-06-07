package models;

import java.util.HashSet;
import java.util.Set;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User extends Model{
    @Id
    public Integer id;
    public Integer type;
    public String username;
    public String email;
    public String password;


    public static Finder<Integer, User> find = new Finder<>(User.class);

    public static Set<User> users;


    public void add(User user){
        users.add(user);
    }

    public static User validate_login(String email, String password) {
        for (User user : users) {
            if (email.equals(user.email)) {
                if (password.equals(user.password)) {
                    return user;
                }
            }
            return user;
        }
        return null;
    }

}
