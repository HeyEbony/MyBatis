import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.session.*;

import javax.xml.soap.SOAPPart;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

public class TestMyBatis {
    public static void main(String[] args) {
//        读文件
       InputStream rs= TestMyBatis.class.getResourceAsStream("configuration.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory=sqlSessionFactoryBuilder.build(rs);
        SqlSession sqlSession=sessionFactory.openSession(true);
        String str="Mapper/UserMapper.findUserById";
        List<Object> objects = sqlSession.selectList(str);
        System.out.println(objects);
    }
}
