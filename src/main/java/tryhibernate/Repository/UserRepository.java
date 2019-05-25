package tryhibernate.Repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tryhibernate.Entity.User;
import tryhibernate.utils.ResultMessage;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

@Repository
public class UserRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public Session getSession(){
        return entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }

    public ResultMessage save(User user){
        Session session = getSession();
        try {
            Transaction tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            session.clear();
            return new ResultMessage(true, "数据插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new ResultMessage(false, "数据插入失败！");
        } finally {
            session.close();
        }
    }
}
