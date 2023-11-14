package kiet.com.vn.labweek7www.ids;

import kiet.com.vn.labweek7www.models.Order;
import kiet.com.vn.labweek7www.models.Product;

import java.io.Serializable;

public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
