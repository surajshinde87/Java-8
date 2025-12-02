// Write a method:
// public static Optional<String> getCity(User user)
// Return:
// empty optional if user or city is null
// city in uppercase using .map()
// "City not available" if empty

import java.util.Optional;

class User {
    String name;
    String city;

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

public class Ques1 {

       public static Optional<String> getCity(User user) {

        return Optional.ofNullable(user)      
                       .map(u -> u.city)     
                       .map(String::toUpperCase); 
    }

    public static void main(String[] args) {

        User u1 = new User("Suraj", "Pune");
        User u2 = new User("Rahul", null);
        User u3 = null;

        System.out.println(
            getCity(u1).orElse("City not available")
        );

        System.out.println(
            getCity(u2).orElse("City not available")
        );

        System.out.println(
            getCity(u3).orElse("City not available")
        );
  
    }
}
