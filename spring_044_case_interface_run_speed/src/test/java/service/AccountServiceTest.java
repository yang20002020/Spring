package service;
import com.fuyu.config.SpringConfig;
import com.fuyu.domain.Account;
import com.fuyu.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void testFindById(){
        Account byId = accountService.findById(1);
    }

    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();
    }

}
