package in.nit.api.service;

import java.util.Collection;

import in.nit.api.entity.Cart;
import in.nit.api.entity.ProductInOrder;
import in.nit.api.entity.User;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
