package thirdparty.dto;

/**
 * DTO for 商品.
 * 一般来说是来自于 Third Party 的 Lib, 这里为了简单, 直接写在同一个项目中.
 */
public class ItemDTO {

    private long id;

    private String name;

    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
