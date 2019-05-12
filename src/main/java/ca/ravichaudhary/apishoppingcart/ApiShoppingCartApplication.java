package ca.ravichaudhary.apishoppingcart;

import ca.ravichaudhary.apishoppingcart.product.ProductService;
import ca.ravichaudhary.apishoppingcart.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiShoppingCartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApiShoppingCartApplication.class, args);

		// Insert sample product dataset
		ProductService productService = applicationContext.getBean(ProductService.class);
		productService.deleteAll();
		productService.insertProductSampleData();

		// Insert sample user dataset
		UserService userService = applicationContext.getBean(UserService.class);
		userService.deleteAll();
		userService.insertUserSampleData();
	}

}
