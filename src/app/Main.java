package app;

public class Main {

    public static void main(String[] args) {

        User user = new User("Vitalii", "Yurchenko");
        Address address = new Address("blvd. Slavy", "Dnipro");

        user.setAddress(address);

        System.out.println("User: " + user);
        System.out.println("Address: " + user.getAddress());
    }
}
