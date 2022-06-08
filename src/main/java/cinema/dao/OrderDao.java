package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    List<Order> getAllByUser(User user);

    Order add(Order order);
}
