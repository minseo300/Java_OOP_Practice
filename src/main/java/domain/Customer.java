package domain;
import config.DBConnection;
import dto.ShopResponse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int tableNum;
    private Order order;
    DBConnection dbConnection=new DBConnection();

    // 음식점 조회 - 음식점 리스트 조회를 Customer가 하는게 좀 이상하긴 하지만, 다른 객체가 하는건 더 이상,,,하지 않나 지금은...?
    public List<Shop> getShopList() throws SQLException {
        String query="select * from shop";
        ResultSet result=dbConnection.selectQuery(query);

        List<Shop> shopList=new ArrayList<>();
        while(result.next()){
            int shopId=result.getInt("shop_id");
            String shopName=result.getString("name");
            String shopTel=result.getString("tel");

            Shop shop=new Shop(shopId,shopName,shopTel);
            shopList.add(shop);
        }
        return shopList;
    }


}
