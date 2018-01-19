package dto;

import entity.OrderEntity;
import thirdparty.dto.ItemDTO;
import thirdparty.dto.UserDTO;

/**
 * DTO for 订单
 */
public class OrderDTO {

    private long id;

    /**
     * 订单的用户
     **/
    private UserDTO user;

    /**
     * 订单的商品
     **/
    private ItemDTO item;

    /**
     * 商品被购买时的单价
     **/
    private double unitPrice;

    /**
     * 用户买了多少件商品
     **/
    private int quantity;

    /**
     * 订单总金额
     **/
    private double totalAmount;

    public OrderDTO(OrderEntity orderEntity, UserDTO user, ItemDTO item) {
        this.id = orderEntity.getId();
        this.user = user;
        this.item = item;
        this.unitPrice = orderEntity.getUnitPrice();
        this.quantity = orderEntity.getQuantity();
        this.totalAmount = orderEntity.getTotalAmount();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
