
package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Address;
import com.example.demo.Model.User;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Long> {
    List<Address> findByUser(User user);
}