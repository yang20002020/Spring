package fuyu.dao.impl;

import fuyu.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running......");
    }
}
