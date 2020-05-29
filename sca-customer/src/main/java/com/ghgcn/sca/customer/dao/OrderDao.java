package com.ghgcn.order.provider.dao;

import com.ghgcn.nacos.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Integer> {
}
