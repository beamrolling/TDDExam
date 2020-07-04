import org.junit.Test;

public class LockerTest {

    //**Given**  一个S号Locker，有剩余空间
    //**When**  存S号包
    //**Then** 包成功存入S号Locker中，返回票
    @Test
    public void should_store_bag_to_s_locker_when_save_s_bag_given_s_locker_has_place() {
        //TODO
    }

    //**Given**  一个S号Locker，无剩余空间
    //**When**  存S号包
    //**Then** 存包失败，显示柜已满
    @Test
    public void should_show_full_error_when_save_s_bag_given_s_locker_is_full() {
        //TODO
    }

    //**Given**  一张有效S号Locker的票
    //**When**  S号Locker取包
    //**Then**  取包成功
    @Test
    public void should_get_bag_when_pick_up_bag_given_valid_s_ticket() {
        //TODO
    }

    //**Given**  一张无效票
    //**When**  S号Locker取包
    //**Then**  取包失败，提示无效票据
    @Test
    public void should_show_invalid_error_when_pick_up_bag_given_invalid_ticket() {
        //TODO
    }

    //**Given**  一张重复使用的S号Locker的票
    //**When**  S号Locker取包
    //**Then**  取包失败，提示无效票据
    @Test
    public void should_show_invalid_error_when_pick_up_bag_given_duplicate_ticket() {
        //TODO
    }

    //**Given**  一张M号Locker的票
    //**When**  S号Locker取包
    //**Then**  取包失败，提示票据不符
    @Test
    public void should_show_incompatible_error_when_pick_up_bag_given_incompatible_ticket() {
        //TODO
    }
}
