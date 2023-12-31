package kiet.com.vn.labweek7www.ids;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kiet.com.vn.labweek7www.models.Product;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;
}
