import java.util.Optional;

class User{
    String name;
    String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public static Optional<String> getEmail(User user){
        // if(user == null){
        //     return Optional.empty();
        // }else if(user.email == null){
        //     return Optional.empty();
        // }else{
        //     return Optional.of(user.email);
        // }

        // better way using map and flatMap
        return Optional.ofNullable(user)
               .map(u -> u.email == null ? null : u.email)
               .flatMap(Optional::ofNullable);


    }
}

public class Main {

    public static void main(String[] args) {
         User u1 = new User("Suraj","surajshinde@gmail.com");
         User u2 = new User("Rahul",null);
         User u3 = null;


            System.out.println(User.getEmail(u1).map(String::toUpperCase).orElse("Email not provided"));
            System.out.println(User.getEmail(u2).map(String::toUpperCase).orElse("Email not provided"));
            System.out.println(User.getEmail(u3).map(String::toUpperCase).orElse("Email not provided"));


    }
    
}
