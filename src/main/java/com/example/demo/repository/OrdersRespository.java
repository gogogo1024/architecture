package com.example.demo.repository;

import com.example.demo.models.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRespository extends CrudRepository<Orders, Integer> {
    @Query("select title from Orders  where title =?1")
    public List<Orders> getOrderByTitle(@Param("title") String title);

    @Query("select o from Orders o where o.id =?1")
    public Orders getOrderById(int id);


    @Query("select o from Orders o ")
    public List<Orders> getAll();

}
