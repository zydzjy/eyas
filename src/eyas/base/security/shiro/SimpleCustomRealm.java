package eyas.base.security.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import eyas.base.bean.UserBean;
import eyas.base.service.ServiceException;
import eyas.base.service.UserService;

public class SimpleCustomRealm extends AuthorizingRealm {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		try {
			// My custom logic here
		} catch (Throwable t) {
			System.out.println(t.getMessage());
		}
		return new SimpleAuthorizationInfo();
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		// My custom logic here
		UsernamePasswordToken _token = (UsernamePasswordToken) token;
		String username = _token.getUsername();
		UserBean user = null;
		try {
			user = this.userService.getUserByUserId(username);
		} catch (ServiceException e) {
			// e.printStackTrace();
			throw new AuthenticationException("查询用户异常", e);
		}
		// UserBeanShiroWrapper wrapper = new UserBeanShiroWrapper(user);
		if (user == null) {
			throw new AuthenticationException("查询用户异常", null);
		} else {
			UserBean credentials = user;
			String principal = user.getUserPwd();
			SimpleAuthenticationInfo authn = new SimpleAuthenticationInfo(
					principal, credentials, "");
			return authn;
		}
	}

}
