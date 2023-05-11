package domain;

import dto.ShopResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class CustomerTest {

    @Test
    @DisplayName("음식점 리스트 조회 테스트")
    void getShopListTest() throws SQLException {
        // given; 어떠한 데이터가 준비되었을 때
        Customer customer=new Customer();
        // when; 어떠한 함수를 실행하면
        List<Shop> shopList=customer.getShopList();
        //then; 어떠한 결과가 나와야 한다.
        assertThat(shopList.size()).isEqualTo(3);
    }


}