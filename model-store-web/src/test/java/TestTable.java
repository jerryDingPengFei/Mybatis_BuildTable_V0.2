import com.sunchenbin.store.manager.system.SysMysqlCreateTableManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:core/applicationContext.xml"})
public class TestTable {
    @Resource
    private SysMysqlCreateTableManager sysMysqlCreateTableManager;
@Test
    public void test123(){
        sysMysqlCreateTableManager.createMysqlTable();
    }
}
