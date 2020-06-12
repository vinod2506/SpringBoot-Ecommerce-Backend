package in.nit.api.service;

import in.nit.api.entity.ProductInOrder;
import in.nit.api.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
