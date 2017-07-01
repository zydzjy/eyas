package eyas.base.security.shiro;

import org.apache.shiro.authc.AuthenticationToken;

import eyas.base.bean.UserBean;

public class UserBeanShiroWrapper implements AuthenticationToken {
	
	protected UserBean userBean;
	public UserBeanShiroWrapper(UserBean userBean){
		this.userBean = userBean;
	}
	
	public UserBean getUserBean() {
		return userBean;
	}
	
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	@Override
	public UserBean getPrincipal() {
		return this.userBean;
	}

	@Override
	public String getCredentials() {
		return this.userBean.getUserPwd();
	}
}
