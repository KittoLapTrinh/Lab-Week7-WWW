package kiet.com.vn.labweek7www.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kiet.com.vn.labweek7www.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}