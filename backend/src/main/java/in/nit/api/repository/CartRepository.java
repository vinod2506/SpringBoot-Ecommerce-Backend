package in.nit.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.api.entity.Cart;

/**
 * Created By Zhu Lin on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
