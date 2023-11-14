package kiet.com.vn.labweek7www.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kiet.com.vn.labweek7www.models.Order;
import kiet.com.vn.labweek7www.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order> {
}