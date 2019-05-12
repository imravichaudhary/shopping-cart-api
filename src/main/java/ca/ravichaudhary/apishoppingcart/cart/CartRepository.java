package ca.ravichaudhary.apishoppingcart.cart;

import ca.ravichaudhary.apishoppingcart.product.Product;
import ca.ravichaudhary.apishoppingcart.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
    public List<Cart> findAllByUserId(String userId);
    public Optional<Cart> findByUserAndProduct(User user, Product product);
}
