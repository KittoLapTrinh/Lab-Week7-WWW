package kiet.com.vn.labweek7www.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kiet.com.vn.labweek7www.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, kiet.com.vn.labweek7www.models.Product> {
}