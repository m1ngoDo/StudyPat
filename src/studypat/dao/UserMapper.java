package studypat.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import studypat.dto.User;

@Mapper
public interface UserMapper {

	public int join(User user);
	public User login(User user);
	public String logout();
	public User getUser(String id);
	public int updateUser(User user);
	public String forgotid(String email);
	public void forgotpass(User user);
	public void sendEmail(User user);
	public int getTempPW(User user);
	public List<User> getUserList();
	public void deleteUser(int userNo);
	public int checkOverId(String id);
	public int checkOverEmail(String email);
	public int checkOverNickName(String nickName);

}
