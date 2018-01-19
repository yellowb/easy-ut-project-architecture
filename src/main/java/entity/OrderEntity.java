package entity;

/**
 * The Entity of 订单表.
 * 简单起见, 一个订单只能包含一种商品, 购买数量可以大于1.
 */
public class OrderEntity {

    private long id;

    /** 订单的用户id **/
    private long userId;

    /** 订单的商品id **/
    private long itemId;

    /** 商品被购买时的单价 **/
    private double unitPrice;

    /** 用户买了多少件商品 **/
    private int quantity;

    /** 订单总金额 **/
    private double totalAmount;

    public OrderEntity(long id, long userId, long itemId, double unitPrice, int quantity, double totalAmount) {
        this.id = id;
        this.userId = userId;
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
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

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", itemId=" + itemId +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
