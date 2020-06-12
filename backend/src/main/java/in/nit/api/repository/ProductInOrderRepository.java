package in.nit.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.api.entity.ProductInOrder;

/**
 * Created By Zhu Lin on 3/14/2018.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
