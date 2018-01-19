package dao;

import java.util.logging.Logger;

import entity.OrderEntity;


/**
 * 订单表的DAO
 */
public class OrderDAO {

    /**
     * 通过Id获取订单
     * @param id
     * @return
     */
    public OrderEntity getById(long id) {

        OrderEntity result = null;

        // 假装自己在查DB...
        try {
            Logger logger = Logger.getLogger("DEFAULT_LOGGER");
            logger.info("Querying OrderEntity...");
            Thread.sleep(1000L);
            result = new OrderEntity(id, 500L, 900L, 2.5, 5, 12.5);
            logger.info("Got : " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

}
