package SLMB.Dao;

import java.util.List;
import java.util.Map;

import SLMB.pojo.users;

public interface UsersDao {
	List<users> Query();
	List<users> PageQuery(Map<String, Object> map);
	users GetById(int id);
	int Delete(int id);
	int Save(users users);
}
