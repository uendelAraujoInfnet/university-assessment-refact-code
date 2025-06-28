package com.uendel;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserTest {

    @Test
    void shouldAddAddressToUser() {
        User user = new User("Alice", "alice@email.com");
        Address address = new Address("123 Main St", "Toronto", "M4B1B3");

        user.addAddress(address);

        List<Address> addresses = user.getAddresses();
        assertThat(addresses).hasSize(1);
        assertThat(addresses.get(0).getCity()).isEqualTo("Toronto");
    }

    @Test
    void shouldNotAllowExternalModificationOfAddressList() {
        User user = new User("Bob", "bob@email.com");
        Address addr = new Address("A St", "City", "00000");
        user.addAddress(addr);

        List<Address> addresses = user.getAddresses();

        assertThatThrownBy(() -> addresses.add(new Address("X", "Y", "Z")))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void shouldAllowUserDataToBeUpdated() {
        User user = new User("Carol", "carol@email.com");

        user.setName("Caroline");
        user.setEmail("caroline@email.com");

        assertThat(user.getName()).isEqualTo("Caroline");
        assertThat(user.getEmail()).isEqualTo("caroline@email.com");
    }
}

