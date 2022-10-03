package gangoffour.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Turxan")
                .lastName("Dunya")
                .birthday(LocalDate.now())
                .build();

        System.out.println(user);
    }
}
