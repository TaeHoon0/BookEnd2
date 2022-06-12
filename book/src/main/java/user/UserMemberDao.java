package user;

import org.apache.ibatis.session.SqlSession;

import mybatis.MybaFactory;

public class UserMemberDao {
	SqlSession session;

	public UserMemberDao() {
		session = MybaFactory.getFactory().openSession();
	}
	
	public boolean userMemberJoin(UserMemberVo vo) {
		boolean b = false;
		
		int cnt = session.insert("user_member.member_insert", vo);
		if(cnt > 0) {
			b = true;
			session.commit();
		} else {
			session.rollback();
		}
		
		return b;
	}
}
