import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SLMB.Dao.UsersDao;
import SLMB.pojo.cfttype;
import SLMB.pojo.uDetail;
import SLMB.pojo.users;


public class test {
public static void main(String[] args) {
	UsersDao usersDao= (SLMB.Dao.UsersDao) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("usersDao");
	for (users u : usersDao.Query()) {
		cfttype cfttype=u.getDid().getCid();
		System.out.println(cfttype.getName());
	}
}
}
